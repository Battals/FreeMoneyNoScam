package com.example.freemoneynoscam.services;

import org.apache.catalina.connector.Connector;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataHandler {

    static Connection con;

    public static Connection connectToDb()
    {
        try
        {
            String jdbcurl = "jdbc:mysql://localhost:3306/free_money";
            con = DriverManager.getConnection(jdbcurl,"root","x");
            System.out.println("Successfully connected.");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        } return con;
    }

}
