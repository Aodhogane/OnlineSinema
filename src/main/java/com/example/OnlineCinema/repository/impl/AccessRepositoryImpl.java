package com.example.OnlineCinema.repository.impl;

import com.example.OnlineCinema.domain.Access;
import com.example.OnlineCinema.domain.Reviews;
import com.example.OnlineCinema.repository.AccessRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

public class AccessRepositoryImpl implements AccessRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Access access) {
        entityManager.persist(access);
    }

    @Override
    public Access findById(int id) {
        return entityManager.find(Access.class, id);
    }

    @Override
    public List<Access> findAll() {
        return entityManager.createQuery("SELECT a FROM Access a", Access.class).getResultList();
    }
}
