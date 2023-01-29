package com.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleQuery {
	static String connectionUrl = "jdbc:mysql://localhost:3306/classicmodels";
    static String userName = "root";
    static String userPass = "password";
    static Connection con=null;

    // Main driver method
    public static void main(String[] args) throws Exception
    {

        
        try {
             con = DriverManager.getConnection(connectionUrl, userName,
                    userPass);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Step 3: Creating statement
        Statement st = con.createStatement();
        String createTable = "CREATE TABLE IF NOT EXISTS EMPLOYEE(" + "ID INT NOT NULL," + "NAME VARCHAR(200))";
        st.executeUpdate(createTable);

        String insertData = "INSERT INTO EMPLOYEE VALUES " + "(0,'luci')," + "(1,'Stan')," + "(2,'Faustus')";

        System.out.println(st.executeUpdate(insertData));
        // Step 4: Executing the query and storing the
        /*// result
        ResultSet rs = st.executeQuery("Select employeeNumber,lastName,firstName,VacationHours from employees where VacationHours >  20");

        // Step 5: Processing the results
        while (rs.next()) {
            System.out.println("Begin New Record");
            System.out.println(rs.getString(0));
            System.out.println(rs.getString("lastName"));
            System.out.println(rs.getString("firstName"));
            System.out.println(rs.getString("VacationHours"));
           // FILL IN CODE HERE
        }
*/
        // Step 6: Closing the connections
        // using close() method to release memory resources
        con.close();
    
    // Display message for successful execution of program
    System.out.println("JDBC query completed");
}
}
