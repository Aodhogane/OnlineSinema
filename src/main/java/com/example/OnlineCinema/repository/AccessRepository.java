package com.example.OnlineCinema.repository;

import com.example.OnlineCinema.domain.Access;

import java.util.List;

public interface AccessRepository {
    void save(Access access);
    Access findById(int id);
    List<Access> findAll();
}
