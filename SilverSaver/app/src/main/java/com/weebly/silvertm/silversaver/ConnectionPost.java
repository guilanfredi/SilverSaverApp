package com.weebly.silvertm.silversaver;

/**
 * Created by LUCAS on 08/10/2016.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionPost {

    public Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            Properties conprop = new Properties();
            conprop.setProperty("user", "postgres");
            conprop.setProperty("password", "");
            return DriverManager.getConnection("jdbc:postgresql://192.168.0.16:5432/ss-1", conprop);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void close (Connection con){
        try {
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
