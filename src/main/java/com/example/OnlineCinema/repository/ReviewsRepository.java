package com.example.OnlineCinema.repository;

import com.example.OnlineCinema.domain.Reviews;

import java.util.List;

public interface ReviewsRepository {
    void save(Reviews review);
    Reviews findById(int id);
    List<Reviews> findAll();
    void update(Reviews review);
    void deleteById(int id);
}