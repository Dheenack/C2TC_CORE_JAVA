package com.tnsif.ifet.day22.summa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDbconnect {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/tnsif_practice", "tnsif", "tnsif");
            System.out.println("Connected with the database successfully");
        } catch (SQLException e) {
            System.out.println("Error while connecting to the database");
            e.printStackTrace();
        }
    }
}
