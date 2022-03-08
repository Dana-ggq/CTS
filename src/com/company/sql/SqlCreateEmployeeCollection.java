package com.company.sql;

import com.company.contracts.CollectionCreator;

import java.sql.Connection;
import java.sql.Statement;

public class SqlCreateEmployeeCollection implements CollectionCreator<Connection, String> {

    @Override
    public void createCollection(Connection connection, String collection) throws Exception {
        String sqlDrop = "DROP TABLE IF EXISTS " + collection;
        String sqlCreate = "CREATE TABLE " +collection+"(id INTEGER PRIMARY KEY,"
                + "name TEXT, address TEXT, salary REAL)";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sqlDrop);
        statement.executeUpdate(sqlCreate);
        statement.close();
        connection.commit();
    }
}
