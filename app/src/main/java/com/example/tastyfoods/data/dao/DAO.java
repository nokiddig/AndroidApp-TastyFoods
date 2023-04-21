package com.example.tastyfoods.data.dao;

import java.util.List;

public interface DAO<T>{
    List<T> getAll();
    void save(T t);
    T findById(int id);
    List<T> findByName(String name);
    void deleteById(int id);
    void updateById(int id, T t);
}
