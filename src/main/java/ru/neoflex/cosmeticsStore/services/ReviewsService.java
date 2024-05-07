package ru.neoflex.cosmeticsStore.services;

import ru.neoflex.cosmeticsStore.entities.Reviews;

import java.util.List;

public interface ReviewsService {

    public List<Reviews> getAllReviews();
    public Reviews getReviewsById(Long id);
    public Reviews createReviews(Reviews reviews);
    public Reviews updateReviews(Reviews reviews);
    public void deleteReviews(Long id);

}
