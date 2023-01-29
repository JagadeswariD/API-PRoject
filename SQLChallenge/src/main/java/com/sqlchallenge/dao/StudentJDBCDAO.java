package com.sqlchallenge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sqlchallenge.model.StudentBean;

public class StudentJDBCDAO {
    Connection connection = null;
    PreparedStatement ptmt = null;
    ResultSet resultSet = null;

    public StudentJDBCDAO() {

    }

    private Connection getConnection() throws SQLException {
        Connection conn;
        conn = ConnectionFactory.getInstance().getConnection();
        return conn;
    }

    public void add(StudentBean studentBean) {
        try {

            // TODO: implement the missing code here!!
            String queryString = "INSERT INTO STUDENT (RollNo, Name, Course, Address ) values(?,?,?,?)";
            connection = getConnection();
            PreparedStatement prepStmt = connection.prepareStatement(queryString);
            prepStmt.setInt(1, studentBean.getRollNo());
			prepStmt.setString(2, studentBean.getName());
			prepStmt.setString(3, studentBean.getCourse());
			prepStmt.setString(4, studentBean.getAddress());
			int affectedRows = prepStmt.executeUpdate();
			
            System.out.println("Data Added Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ptmt != null)
                    ptmt.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    public void update(StudentBean studentBean) {

        try {
            String queryString = "UPDATE student SET Name=? WHERE RollNo=?";
            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);
            ptmt.setString(1, studentBean.getName());
            ptmt.setInt(2, studentBean.getRollNo());
            ptmt.executeUpdate();
            System.out.println("**Table Updated Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ptmt != null)
                    ptmt.close();
                if (connection != null)
                    connection.close();
            }

            catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        
    }

    public void delete(int rollNo) {

        try {
            String queryString = "DELETE FROM student WHERE RollNo=?";
            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);
            ptmt.setInt(1, rollNo);
            ptmt.executeUpdate();
            System.out.println("Data deleted Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ptmt != null)
                    ptmt.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    public void findAll() {
        try {

// TODO: Implement missing code here!!!
            String queryString = "SELECT ROLLNO, NAME, ADDRESS, COURSE FROM STUDENT";
            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);
            resultSet = ptmt.executeQuery();
            while (resultSet.next()) {
                System.out.println("ROLLNO: "+resultSet.getInt(1)+" NAME: "+resultSet.getString(2)+" ADDRESS: "+resultSet.getString(3)+ " COURSE: "+resultSet.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null)
                    resultSet.close();
                if (ptmt != null)
                    ptmt.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}