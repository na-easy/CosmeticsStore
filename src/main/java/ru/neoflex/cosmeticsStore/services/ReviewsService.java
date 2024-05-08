package ru.neoflex.cosmeticsStore.services;

import ru.neoflex.cosmeticsStore.dto.ReviewsDTO;
import ru.neoflex.cosmeticsStore.entities.Reviews;

import java.util.List;

public interface ReviewsService {

    List<ReviewsDTO> getAllReviews();
    ReviewsDTO getReviewsById(Long id);
    Reviews createReviews(ReviewsDTO reviews);
    Reviews updateReviews(ReviewsDTO reviews);
    void deleteReviews(Long id);

}
