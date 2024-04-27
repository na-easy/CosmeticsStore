package ru.neoflex.cosmeticsStore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ru.neoflex.cosmeticsStore.dto.ReviewsDTO;
import ru.neoflex.cosmeticsStore.entities.Reviews;
import ru.neoflex.cosmeticsStore.services.ReviewsService;
import ru.neoflex.cosmeticsStore.utils.MappingUtils;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reviews")
public class ReviewsController {

    private final ReviewsService reviewsService;
    private final MappingUtils mappingUtils;

    @Autowired
    public ReviewsController(ReviewsService reviewsService, MappingUtils mappingUtils) {
        this.reviewsService = reviewsService;
        this.mappingUtils = mappingUtils;
    }

    @GetMapping
    public List<ReviewsDTO> getAllReviews() {
        return reviewsService.getAllReviews().stream()
                .map(mappingUtils::mapToReviewsDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ReviewsDTO getReviewsById(@PathVariable Long id) {
        return mappingUtils.mapToReviewsDto(reviewsService.getReviewsById(id));
    }

    @PostMapping
    public Reviews createReviews(@RequestBody ReviewsDTO reviews) {
        return reviewsService.createReviews(mappingUtils.mapToReviewsEntity(reviews));
    }

    @PutMapping("/{id}")
    public Reviews updateReviews(@PathVariable Long id, @RequestParam ReviewsDTO reviews) {
        reviews.setId(id);
        return reviewsService.updateReviews(mappingUtils.mapToReviewsEntity(reviews));
    }

    @DeleteMapping("/{id}")
    public void deleteReviews(@PathVariable Long id) {
        reviewsService.deleteReviews(id);
    }
}
