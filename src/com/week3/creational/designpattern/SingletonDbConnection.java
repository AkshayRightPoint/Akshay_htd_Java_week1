package com.week3.creational.designpattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonDbConnection {
    private static volatile SingletonDbConnection instance;
    private Connection connection;

    private static final String URL= "jdbc:mysql://localhost:3306/testdb";
    private static final String USER ="root";
    private static final String PASSWORD = "password";

    private void SingletonDbConnection() throws SQLException {
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static SingletonDbConnection getInstance() {
        if(instance == null){
            synchronized (SingletonDbConnection.class){
                if(instance == null){
                   instance=  new SingletonDbConnection();
                }
            }
        }
        return instance;
    }

    public Connection getDbConnection(){
        return connection;
    }
}
