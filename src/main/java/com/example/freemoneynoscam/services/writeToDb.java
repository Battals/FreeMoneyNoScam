package com.example.freemoneynoscam.services;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class writeToDb {


    public static void insertEmailToDB(String email){

        try {
            PreparedStatement statement = DataHandler.connectToDb().prepareStatement("INSERT INTO free_money.emails(`email`) VALUES (?);");
            statement.setString(1,email);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
