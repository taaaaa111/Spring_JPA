package com.example.demo.interfaces;

public interface IDAO <T>{

    boolean create(T o);

    boolean update(T o);

    boolean delete(T o);

    T changestate(boolean);




}
