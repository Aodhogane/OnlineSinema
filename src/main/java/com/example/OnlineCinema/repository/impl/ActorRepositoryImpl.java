package com.example.OnlineCinema.repository.impl;

import com.example.OnlineCinema.domain.Actors;
import com.example.OnlineCinema.repository.ActorRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ActorRepositoryImpl implements ActorRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Actors actors) {
        entityManager.persist(actors);
    }

    @Override
    public Actors findById(int id) {
        return entityManager.find(Actors.class, id);
    }

    @Override
    public List<Actors> findAll() {
        return entityManager.createQuery("SELECT a FROM Actor a", Actors.class).getResultList();
    }
}