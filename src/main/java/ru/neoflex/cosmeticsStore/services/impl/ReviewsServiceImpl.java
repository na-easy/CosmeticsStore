package ru.neoflex.cosmeticsStore.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.neoflex.cosmeticsStore.entities.Reviews;
import ru.neoflex.cosmeticsStore.repository.ReviewsRepository;
import ru.neoflex.cosmeticsStore.services.ReviewsService;

import java.util.List;

@Service
public class ReviewsServiceImpl implements ReviewsService {

    private final ReviewsRepository reviewsRepository;

    public ReviewsServiceImpl(ReviewsRepository reviewsRepository) {
        this.reviewsRepository = reviewsRepository;
    }

    @Override
    public List<Reviews> getAllReviews() {
        return reviewsRepository.findAll();
    }

    @Override
    public Reviews getReviewsById(Long id) {
        return reviewsRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Reviews createReviews(Reviews reviews) {
        return reviewsRepository.save(reviews);
    }

    @Override
    @Transactional
    public Reviews updateReviews(Reviews reviews) {
        return reviewsRepository.save(reviews);
    }

    @Override
    public void deleteReviews(Long id) {
        reviewsRepository.deleteById(id);
    }

}
