package com.example.OnlineCinema.repository.impl;

import com.example.OnlineCinema.domain.Film;
import com.example.OnlineCinema.repository.FilmRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FilmRepositoryImpl implements FilmRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Film film) {
        entityManager.persist(film);
    }

    @Override
    public Film findById(int id) {
        return entityManager.find(Film.class, id);  // Ищем фильм по ID
    }

    @Override
    public List<Film> findAll() {
        return entityManager.createQuery("SELECT f FROM Film f", Film.class).getResultList();
    }
}
