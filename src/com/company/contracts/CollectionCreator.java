package com.company.contracts;

public interface CollectionCreator<T, Z> {
    void createCollection(T connection, Z collection) throws Exception;
}
