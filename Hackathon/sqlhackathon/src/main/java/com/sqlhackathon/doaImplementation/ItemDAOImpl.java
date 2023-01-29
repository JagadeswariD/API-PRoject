package com.sqlhackathon.doaImplementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sqlhackathon.doaInterface.ConnectionDAO;
import com.sqlhackathon.doaInterface.ItemDAO;
import com.sqlhackathon.model.Item;

public class ItemDAOImpl extends ConnectionDAO implements ItemDAO {

	public List<Item> getAllItems() {
		try {
			Connection connection = ConnectionDAO.getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM itemR");
			List<Item> itemList = new ArrayList<Item>();
			while (rs.next()) {
				Item i = new Item();
				i.setName(rs.getString("name"));
				i.setPrice(rs.getDouble("price"));
				itemList.add(i);
			}
			return itemList;

		} catch (SQLException ex) {
			ex.printStackTrace();
			System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	 public boolean updateItem(Item item, int id){
	        try {
	            Connection connection = ConnectionDAO.getConnection();
	            PreparedStatement ps = connection.prepareStatement("UPDATE item SET name=?, price=? WHERE id=?");
	            ps.setString(1, item.getName());
	            ps.setDouble(2,item.getPrice());
	            ps.setInt(3, id);
	           int i = ps.executeUpdate();
	           if(i == 1) {
	               return true;
	           }
	       }
	       catch (ClassNotFoundException e)
	       {
	           e.printStackTrace();
	       }
	       catch (SQLException e) {
	           e.printStackTrace();
	           System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
	       }
	       return false;
	   }
	public boolean addItem(Item i) {
		try {
			Connection con = ConnectionDAO.getConnection();

			String sqlQuery = "INSERT INTO item (name,price) VALUES (?,?)";
			PreparedStatement prepStmt = con.prepareStatement(sqlQuery);
			prepStmt.setString(1, i.getName());
			prepStmt.setDouble(2, i.getPrice());
			int affectedRows = prepStmt.executeUpdate();
			System.out.println(affectedRows + " row(s) affected !!");
			if (affectedRows == 1)
				return true;
		} catch (ClassNotFoundException e) {
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		return false;
	}

	public boolean removeItemById(int id) {
		try {
			Connection connection = ConnectionDAO.getConnection();
			PreparedStatement ps = connection.prepareStatement("DELETE FROM item WHERE id=?");
			ps.setInt(1, id);
			int i = ps.executeUpdate();
			if (i == 1) {
				return true;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException ex) {
			System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
		}
		return false;
	}

}
