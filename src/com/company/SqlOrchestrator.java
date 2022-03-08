package com.company;

import com.company.contracts.*;

import java.sql.Connection;

public class SqlOrchestrator extends Orchestrator{

    private CollectionCreator collectionCreator;
    private ConnectionCloser connectionCloser;
    private ConnectionOpener connectionOpener;
    private DataInsert dataInsert;
    private DataReader dataReader;

    private String connection;
    private String collection;

    public SqlOrchestrator(CollectionCreator collectionCreator, ConnectionCloser connectionCloser, ConnectionOpener connectionOpener, DataInsert dataInsert, DataReader dataReader,
                           String connection, String collection) {
        super(collectionCreator, connectionCloser, connectionOpener, dataInsert, dataReader);
        this.collectionCreator = collectionCreator;
        this.connectionCloser = connectionCloser;
        this.connectionOpener = connectionOpener;
        this.dataInsert = dataInsert;
        this.dataReader = dataReader;
        this.connection = connection;
        this.collection = collection;
    }

    public void run() throws Exception {
        connectionOpener.openConnection(connection);
        collectionCreator.createCollection(connection,collection);
        dataInsert.insertData(connection);
        dataReader.readData(connection);
        connectionCloser.closeConnection(connection);
    }
}
