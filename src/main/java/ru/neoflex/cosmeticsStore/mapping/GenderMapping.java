package ru.neoflex.cosmeticsStore.mapping;

import org.mapstruct.Mapper;
import ru.neoflex.cosmeticsStore.dto.GenderDTO;
import ru.neoflex.cosmeticsStore.entities.Gender;

@Mapper(componentModel = "spring")
public interface GenderMapping {
    GenderDTO mapToGenderDto(Gender entity);
    Gender mapToGenderEntity(GenderDTO dto);
}
