package ru.neoflex.cosmeticsStore.controllers;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;

import ru.neoflex.cosmeticsStore.dto.ReviewsDTO;
import ru.neoflex.cosmeticsStore.entities.Reviews;
import ru.neoflex.cosmeticsStore.services.ReviewsService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reviews")
public class ReviewsController {

    private final ReviewsService reviewsService;

    @GetMapping
    public List<ReviewsDTO> getAllReviews() {
        return reviewsService.getAllReviews();
    }

    @GetMapping("/{id}")
    public ReviewsDTO getReviewsById(@PathVariable Long id) {
        return reviewsService.getReviewsById(id);
    }

    @PostMapping
    public Reviews createReviews(@RequestBody ReviewsDTO reviews) {
        return reviewsService.createReviews(reviews);
    }

    @PutMapping("/{id}")
    public Reviews updateReviews(@PathVariable Long id, @RequestParam ReviewsDTO reviews) {
        reviews.setId(id);
        return reviewsService.updateReviews(reviews);
    }

    @DeleteMapping("/{id}")
    public void deleteReviews(@PathVariable Long id) {
        reviewsService.deleteReviews(id);
    }
}
