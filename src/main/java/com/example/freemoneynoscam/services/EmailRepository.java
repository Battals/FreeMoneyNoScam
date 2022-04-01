package com.example.freemoneynoscam.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmailRepository {

    DataHandler dh = new DataHandler();
    private ArrayList<Mail> emails = new ArrayList<>();
    private Connection con;
    private Statement stmt;
    private ResultSet rs;

    public String fetchSingleEmail(){
        String email = "";
        return email;
    }

    public ArrayList<Mail> fetchAllEmails() {
        try {
            stmt = con.createStatement();
            String sqlString = "SELECT * FROM free_money.emails";
            rs = stmt.executeQuery(sqlString);

            int id;
            String email;
            while (rs.next()) {
                id = rs.getInt("id");
                email = rs.getString("email");
                emails.add(new Mail(id, email));
            }

            return emails;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
