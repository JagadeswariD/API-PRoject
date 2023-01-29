package com.sqlhackathon.doaImplementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sqlhackathon.doaInterface.ConnectionDAO;
import com.sqlhackathon.doaInterface.CustomerDAO;
import com.sqlhackathon.model.Customer;

public class CustomerDAOImpl extends ConnectionDAO implements CustomerDAO {

	public Customer getCustomerById(int id) {
		try {
	        Connection connection = ConnectionDAO.getConnection();
	        Statement stmt = connection.createStatement();
	        ResultSet rs = stmt.executeQuery("SELECT * FROM customer where id="+id);
	        Customer c = new Customer();
	        
	        while(rs.next())
	        {
	        	c.setEmail(rs.getString("email"));
	        	c.setFname(rs.getString("fname"));
	        	c.setLname(rs.getString("lname"));
	            
	           
	        }
	        return c;

	    } catch (SQLException ex) {
	        ex.printStackTrace();
	        System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    }
	    return null;
	}

	public boolean addCustomer(Customer c) {
		 try {
	          Connection con = ConnectionDAO.getConnection();
	             String sqlQuery = "INSERT INTO customer (email,fname,lname) VALUES (?,?,?)";
	              PreparedStatement prepStmt = con.prepareStatement(sqlQuery);
	              prepStmt.setString(1, c.getEmail() );
	              prepStmt.setString(2, c.getFname());
	              prepStmt.setString(3, c.getLname());
	              int affectedRows = prepStmt.executeUpdate();
	              System.out.println(affectedRows + " row(s) affected !!");
	              if(affectedRows==1)
	            	  	return true;
	       }
	       catch (ClassNotFoundException e)
	       {
	       } catch (SQLException throwables) {
	           throwables.printStackTrace();
	       }
		return false;
	}

	public boolean removeCustomerById(int id) {
		 try {
	           Connection connection = ConnectionDAO.getConnection();
	           PreparedStatement ps = connection.prepareStatement("DELETE FROM customer WHERE id=?");
	           ps.setInt(1, id);
	           int i = ps.executeUpdate();
	           if(i == 1) {
	               return true;
	           }
	       } catch (ClassNotFoundException e)
	       {
	           e.printStackTrace();
	       }
	       catch (SQLException ex) {
	           System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
	       }
	       return false;
	}

}
