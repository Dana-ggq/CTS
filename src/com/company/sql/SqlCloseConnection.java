package com.company.sql;

import com.company.contracts.ConnectionCloser;

import java.sql.Connection;

public class SqlCloseConnection implements ConnectionCloser<Connection> {
    @Override
    public void closeConnection(Connection connection) throws Exception {
        connection.close();
    }
}
