package com.company.data;

import com.company.data.interfaces.IDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresDB implements IDB {
    /**
     * Overridden method getConnection from IDB interface
     */
    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        //Path to the database
        String connectionUrl = "jdbc:postgresql://localhost:5432/postgres";
        try {
            // Here we load the driver’s class file into memory at the runtime
            Class.forName("org.postgresql.Driver");
            // Establish the connection
            Connection con = DriverManager.getConnection(connectionUrl, "postgres", "qweqwe2");

            return con;
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }
}