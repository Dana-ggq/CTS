package com.company.contracts;

public interface DataReader <T>{
    void readData(T connection) throws Exception;
}
