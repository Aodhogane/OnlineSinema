package com.example.OnlineCinema.repository.impl;

import com.example.OnlineCinema.domain.Reviews;
import com.example.OnlineCinema.repository.ReviewsRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReviewsRepositoryImpl implements ReviewsRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Reviews review) {
        entityManager.persist(review);
    }

    @Override
    public Reviews findById(int id) {
        return entityManager.find(Reviews.class, id);
    }

    @Override
    public List<Reviews> findAll() {
        return entityManager.createQuery("SELECT r FROM Reviews r", Reviews.class).getResultList();
    }

    @Override
    public void update(Reviews review) {
        entityManager.merge(review);
    }

    @Override
    public void deleteById(int id) {
        Reviews review = findById(id);
        if (review != null) {
            entityManager.remove(review);
        }
    }
}
