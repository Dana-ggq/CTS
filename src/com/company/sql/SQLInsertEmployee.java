package com.company.sql;

import com.company.contracts.DataInsert;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class SQLInsertEmployee implements DataInsert<Connection> {
    @Override
    public void insertData(Connection connection) throws Exception {
        String sqlInsertWithParams = "INSERT INTO employees VALUES (?,?,?,?)";
        PreparedStatement preparedStatement =
                connection.prepareStatement(sqlInsertWithParams);
        preparedStatement.setInt(1, 2);
        preparedStatement.setString(2, "Ionescu Vasile");
        preparedStatement.setString(3, "Brasov");
        preparedStatement.setDouble(4, 4500);
        preparedStatement.executeUpdate();
        preparedStatement.close();

        connection.commit();
    }
}
