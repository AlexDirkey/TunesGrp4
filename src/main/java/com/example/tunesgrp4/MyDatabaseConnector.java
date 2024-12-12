package com.example.tunesgrp4;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.SQLException;

public class MyDatabaseConnector {

    private static SQLServerDataSource dataSource;

    public MyDatabaseConnector() {
        dataSource = new SQLServerDataSource();
        dataSource.setServerName("10.176.111.34");
        dataSource.setDatabaseName("Grp4Tunes");
        dataSource.setUser("CSe2024a_e_0");
        dataSource.setPassword("CSe2024aE0!24");
        dataSource.setPortNumber(1433);
        dataSource.setEncrypt("true");
        dataSource.getTrustServerCertificate();
    }

    public static Connection getConnection() throws SQLServerException {
        return dataSource.getConnection();
    }

    public static void main(String[] args) throws SQLServerException {

        MyDatabaseConnector databaseConnector = new MyDatabaseConnector();
        try (Connection connection = databaseConnector.getConnection()) {


            System.out.println("is it closed?" + !connection.isClosed());
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}