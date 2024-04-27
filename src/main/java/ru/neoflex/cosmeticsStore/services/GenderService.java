package ru.neoflex.cosmeticsStore.services;

import ru.neoflex.cosmeticsStore.entities.Gender;
import ru.neoflex.cosmeticsStore.repository.GenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.neoflex.cosmeticsStore.utils.MappingUtils;

import java.util.List;

@Service
public class GenderService {

    private final GenderRepository genderRepository;
    private MappingUtils mappingUtils;

    @Autowired
    public GenderService(GenderRepository genderRepository) {
        this.genderRepository = genderRepository;
    }

    public List<Gender> getAllGender() {
        return genderRepository.findAll();
    }

    public Gender getGenderById(Long id) {
        return genderRepository.findById(id).orElse(null);
    }

    public Gender createGender(Gender gender) {
        return genderRepository.save(gender);
    }

    public Gender updateGender(Gender gender) {
        return genderRepository.save(gender);
    }

    public void deleteGender(Long id) {
        genderRepository.deleteById(id);
    }
}
