package com.example.OnlineCinema.repository.impl;

import com.example.OnlineCinema.domain.Genres;
import com.example.OnlineCinema.domain.Reviews;
import com.example.OnlineCinema.repository.GenreRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

public class GenreRepositoryImpl implements GenreRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Genres genres) {
        entityManager.persist(genres);
    }

    @Override
    public Genres findById(int id) {
        return entityManager.find(Genres.class, id);
    }

    @Override
    public List<Genres> findAll() {
        return entityManager.createQuery("SELECT g FROM Genre g", Genres.class).getResultList();
    }
}
