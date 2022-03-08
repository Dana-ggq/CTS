package com.company.contracts;

public interface DataInsert<T> {
    void insertData(T connection) throws Exception;
}
