package com.company;

import com.company.contracts.*;

public abstract class Orchestrator {

    private CollectionCreator collectionCreator;
    private ConnectionCloser  connectionCloser;
    private ConnectionOpener connectionOpener;
    private DataInsert dataInsert;
    private DataReader dataReader;

    public Orchestrator(CollectionCreator collectionCreator, ConnectionCloser connectionCloser, ConnectionOpener connectionOpener, DataInsert dataInsert, DataReader dataReader) {
        this.collectionCreator = collectionCreator;
        this.connectionCloser = connectionCloser;
        this.connectionOpener = connectionOpener;
        this.dataInsert = dataInsert;
        this.dataReader = dataReader;
    }

    public abstract void run() throws Exception;

}
