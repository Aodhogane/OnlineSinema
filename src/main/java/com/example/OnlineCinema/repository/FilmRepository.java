package com.example.OnlineCinema.repository;

import com.example.OnlineCinema.domain.Film;

import java.util.List;

public interface FilmRepository {
    void save(Film film);
    Film findById(int id);
    List<Film> findAll();
}
