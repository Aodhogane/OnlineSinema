package com.example.OnlineCinema.repository;

import com.example.OnlineCinema.domain.Genres;

import java.util.List;

public interface GenreRepository {
    void save(Genres genres);
    Genres findById(int id);
    List<Genres> findAll();
}
