package ru.neoflex.cosmeticsStore.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.neoflex.cosmeticsStore.entities.Gender;
import ru.neoflex.cosmeticsStore.repository.GenderRepository;
import ru.neoflex.cosmeticsStore.services.GenderService;

import java.util.List;

@Service
public class GenderServiceImpl implements GenderService {

    private final GenderRepository genderRepository;

    public GenderServiceImpl(GenderRepository genderRepository) {
        this.genderRepository = genderRepository;
    }

    @Override
    public List<Gender> getAllGender() {
        return genderRepository.findAll();
    }

    @Override
    public Gender getGenderById(Long id) {
        return genderRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Gender createGender(Gender gender) {
        return genderRepository.save(gender);
    }

    @Override
    @Transactional
    public Gender updateGender(Gender gender) {
        return genderRepository.save(gender);
    }

    @Override
    public void deleteGender(Long id) {
        genderRepository.deleteById(id);
    }

}
