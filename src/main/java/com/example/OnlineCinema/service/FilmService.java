package com.example.OnlineCinema.service;

import com.example.OnlineCinema.domain.Film;
import com.example.OnlineCinema.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {
    private final FilmRepository filmRepository;

    @Autowired
    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public Film getFilmById(int id) {
        return filmRepository.findById(id);  // Получаем фильм по ID
    }

    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }
}
