package ru.neoflex.cosmeticsStore.mapping;

import org.mapstruct.Mapper;
import ru.neoflex.cosmeticsStore.dto.ReviewsDTO;
import ru.neoflex.cosmeticsStore.entities.Reviews;

@Mapper(componentModel = "spring")
public interface ReviewsMapping {
    ReviewsDTO mapToReviewsDto(Reviews entity);
    Reviews mapToReviewsEntity(ReviewsDTO dto);
}
