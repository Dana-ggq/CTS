package com.company.contracts;

public interface ConnectionCloser<T> {
    void closeConnection(T connection) throws Exception;
}
