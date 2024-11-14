package com.example.OnlineCinema.repository;

import com.example.OnlineCinema.domain.Directors;


import java.util.List;

public interface DirectorRepository {
    void save(Directors directors);
    Directors findById(int id);
    List<Directors> findAll();
}
