package com.company.contracts;

public interface ConnectionOpener<T>{
    void openConnection(T connectionUrl) throws Exception;
}
