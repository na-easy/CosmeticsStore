package ru.neoflex.cosmeticsStore.services.impl;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.neoflex.cosmeticsStore.dto.ReviewsDTO;
import ru.neoflex.cosmeticsStore.entities.Reviews;
import ru.neoflex.cosmeticsStore.mapping.ReviewsMapping;
import ru.neoflex.cosmeticsStore.repository.ReviewsRepository;
import ru.neoflex.cosmeticsStore.services.ReviewsService;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ReviewsServiceImpl implements ReviewsService {

    private final ReviewsRepository reviewsRepository;
    private final ReviewsMapping mappingUtils;

    @Override
    public List<ReviewsDTO> getAllReviews() {
        return reviewsRepository.findAll().stream()
                .map(mappingUtils::mapToReviewsDto)
                .collect(Collectors.toList());
    }

    @Override
    public ReviewsDTO getReviewsById(Long id) {
        return mappingUtils.mapToReviewsDto(reviewsRepository.findById(id).orElse(null));
    }

    @Override
    @Transactional
    public Reviews createReviews(ReviewsDTO reviews) {
        return reviewsRepository.save(mappingUtils.mapToReviewsEntity(reviews));
    }

    @Override
    @Transactional
    public Reviews updateReviews(ReviewsDTO reviews) {
        return reviewsRepository.save(mappingUtils.mapToReviewsEntity(reviews));
    }

    @Override
    public void deleteReviews(Long id) {
        reviewsRepository.deleteById(id);
    }

}
