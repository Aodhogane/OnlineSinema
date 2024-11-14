package com.example.OnlineCinema.repository.impl;

import com.example.OnlineCinema.domain.Tickets;
import com.example.OnlineCinema.repository.TicketsRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TicketsRepositoryImpl implements TicketsRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Tickets ticket) {
        entityManager.persist(ticket);
    }

    @Override
    public Tickets findById(int id) {
        return entityManager.find(Tickets.class, id);
    }

    @Override
    public List<Tickets> findAll() {
        return entityManager.createQuery("SELECT t FROM Tickets t", Tickets.class).getResultList();
    }

    @Override
    public void deleteById(int id) {
        Tickets ticket = findById(id);
        if (ticket != null) {
            entityManager.remove(ticket);
        }
    }
}
