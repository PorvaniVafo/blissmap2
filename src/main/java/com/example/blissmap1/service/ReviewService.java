package com.example.blissmap1.service;

import com.example.blissmap1.entity.Review;
import com.example.blissmap1.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public Review getReviewById(Long id) {
        return reviewRepository.findById(id).orElse(null);
    }

    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }

    public Review updateReview(Long id, Review updatedReview) {
        return reviewRepository.findById(id).map(review -> {
            review.setComment(updatedReview.getComment());
            review.setRating(updatedReview.getRating());
            review.setDoctor(updatedReview.getDoctor());
            review.setUser(updatedReview.getUser());
            return reviewRepository.save(review);
        }).orElse(null);
    }

    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }
}
