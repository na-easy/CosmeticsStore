package ru.neoflex.cosmeticsStore.services.impl;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.neoflex.cosmeticsStore.dto.GenderDTO;
import ru.neoflex.cosmeticsStore.entities.Gender;
import ru.neoflex.cosmeticsStore.mapping.GenderMapping;
import ru.neoflex.cosmeticsStore.repository.GenderRepository;
import ru.neoflex.cosmeticsStore.services.GenderService;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class GenderServiceImpl implements GenderService {

    private final GenderRepository genderRepository;
    private final GenderMapping mappingUtils;

    @Override
    public List<GenderDTO> getAllGender() {
        return genderRepository.findAll().stream()
                .map(mappingUtils::mapToGenderDto)
                .collect(Collectors.toList());
    }

    @Override
    public GenderDTO getGenderById(Long id) {
        return mappingUtils.mapToGenderDto(genderRepository.findById(id).orElse(null));
    }

    @Override
    @Transactional
    public Gender createGender(GenderDTO gender) {
        return genderRepository.save(mappingUtils.mapToGenderEntity(gender));
    }

    @Override
    @Transactional
    public Gender updateGender(GenderDTO gender) {
        return genderRepository.save(mappingUtils.mapToGenderEntity(gender));
    }

    @Override
    public void deleteGender(Long id) {
        genderRepository.deleteById(id);
    }

}
