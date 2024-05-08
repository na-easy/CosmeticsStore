package ru.neoflex.cosmeticsStore.services;

import ru.neoflex.cosmeticsStore.dto.GenderDTO;
import ru.neoflex.cosmeticsStore.entities.Gender;

import java.util.List;

public interface GenderService {

    List<GenderDTO> getAllGender();
    GenderDTO getGenderById(Long id);
    Gender createGender(GenderDTO gender);
    Gender updateGender(GenderDTO gender);
    void deleteGender(Long id);

}
