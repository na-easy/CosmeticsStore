package ru.neoflex.cosmeticsStore.services;

import ru.neoflex.cosmeticsStore.entities.Reviews;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReviewsService {

    public List<Reviews> getAllReviews();
    public Reviews getReviewsById(Long id);
    public Reviews createReviews(Reviews reviews);
    public Reviews updateReviews(Reviews reviews);
    public void deleteReviews(Long id);

}
