package com.example.OnlineCinema.Controller;

import com.example.OnlineCinema.domain.Reviews;
import com.example.OnlineCinema.dto.ReviewsDTO;
import com.example.OnlineCinema.service.ReviewService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    private final ReviewService reviewService;
    private final ModelMapper modelMapper;

    @Autowired
    public ReviewController(ReviewService reviewService, ModelMapper modelMapper) {
        this.reviewService = reviewService;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    public void addReview(@RequestBody ReviewsDTO reviewsDTO) {
        reviewService.addReview(modelMapper.map(reviewsDTO, Reviews.class));
    }

    @GetMapping("/{id}")
    public ReviewsDTO getReviewById(@PathVariable int id) {
        return modelMapper.map(reviewService.getReviewById(id), ReviewsDTO.class);
    }

    @GetMapping
    public List<ReviewsDTO> getAllReviews() {
        return reviewService.getAllReviews().stream()
                .map(review -> modelMapper.map(review, ReviewsDTO.class))
                .collect(Collectors.toList());
    }

    @PutMapping("/{id}")
    public void updateReview(@PathVariable int id, @RequestBody ReviewsDTO reviewsDTO) {
        Reviews review = modelMapper.map(reviewsDTO, Reviews.class);
        review.setId(id);
        reviewService.updateReview(review);
    }

    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable int id) {
        reviewService.deleteReview(id);
    }
}
