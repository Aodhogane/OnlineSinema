package com.example.OnlineCinema.repository.impl;

import com.example.OnlineCinema.domain.Directors;
import com.example.OnlineCinema.domain.Reviews;
import com.example.OnlineCinema.repository.DirectorRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

public class DirectorRepositoryImpl implements DirectorRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Directors directors) {
        entityManager.persist(directors);
    }

    @Override
    public Directors findById(int id) {
        return entityManager.find(Directors.class, id);
    }

    @Override
    public List<Directors> findAll() {
        return entityManager.createQuery("SELECT d FROM Directoes d", Directors.class).getResultList();

    }
}
