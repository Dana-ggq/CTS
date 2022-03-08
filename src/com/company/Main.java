package com.company;

import com.company.contracts.*;
import com.company.sql.*;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CollectionCreator collectionCreator = new SqlCreateEmployeeCollection();
        ConnectionCloser<Connection> connectionCloser = new SqlCloseConnection();
        ConnectionOpener<String> connectionOpener = new SqlOpenConnection();
        DataInsert<Connection> dataInsert = new SQLInsertEmployee();
        DataReader<Connection> dataReader = new SQLReadEmployee();
        String connection = "jdbc:sqlite:database.db";
        String collection = "employees";
        Orchestrator orchestrator = new SqlOrchestrator( collectionCreator,  connectionCloser,  connectionOpener,  dataInsert,  dataReader,
                 connection,  collection);
    }
}
