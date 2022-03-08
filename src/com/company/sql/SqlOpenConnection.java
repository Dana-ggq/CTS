package com.company.sql;

import com.company.contracts.ConnectionOpener;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqlOpenConnection implements ConnectionOpener<String> {
    @Override
    public void openConnection(String connectionUrl) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection(connectionUrl);
        connection.setAutoCommit(false);
    }
}
