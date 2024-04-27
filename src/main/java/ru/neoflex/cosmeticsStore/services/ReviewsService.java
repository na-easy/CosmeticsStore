package ru.neoflex.cosmeticsStore.services;

import ru.neoflex.cosmeticsStore.entities.Reviews;
import ru.neoflex.cosmeticsStore.repository.ReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewsService {

    private final ReviewsRepository reviewsRepository;

    @Autowired
    public ReviewsService(ReviewsRepository reviewsRepository) {
        this.reviewsRepository = reviewsRepository;
    }

    public List<Reviews> getAllReviews() {
        return reviewsRepository.findAll();
    }

    public Reviews getReviewsById(Long id) {
        return reviewsRepository.findById(id).orElse(null);
    }

    public Reviews createReviews(Reviews reviews) {
        return reviewsRepository.save(reviews);
    }

    public Reviews updateReviews(Reviews reviews) {
        return reviewsRepository.save(reviews);
    }

    public void deleteReviews(Long id) {
        reviewsRepository.deleteById(id);
    }
}
