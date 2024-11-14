package com.example.OnlineCinema.service;

import com.example.OnlineCinema.domain.Reviews;
import com.example.OnlineCinema.repository.ReviewsRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    private final ReviewsRepository reviewsRepository;

    @Autowired
    public ReviewService(ReviewsRepository reviewsRepository) {
        this.reviewsRepository = reviewsRepository;
    }

    @Transactional
    public void addReview(Reviews review) {
        reviewsRepository.save(review);
    }

    public Reviews getReviewById(int id) {
        return reviewsRepository.findById(id);
    }

    public List<Reviews> getAllReviews() {
        return reviewsRepository.findAll();
    }

    @Transactional
    public void updateReview(Reviews review) {
        reviewsRepository.update(review);
    }

    @Transactional
    public void deleteReview(int id) {
        reviewsRepository.deleteById(id);
    }
}
