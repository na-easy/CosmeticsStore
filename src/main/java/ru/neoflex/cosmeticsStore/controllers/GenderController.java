package ru.neoflex.cosmeticsStore.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import ru.neoflex.cosmeticsStore.dto.GenderDTO;
import ru.neoflex.cosmeticsStore.entities.Gender;
import ru.neoflex.cosmeticsStore.services.GenderService;
import ru.neoflex.cosmeticsStore.utils.mapping.GenderMapping;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/gender")
public class GenderController {

    private final GenderService genderService;
    private final GenderMapping mappingUtils;

    @GetMapping
    public List<Gender> getAllGender() {
        return genderService.getAllGender();
    }

    @GetMapping("/{id}")
    public GenderDTO getGenderById(@PathVariable Long id) {
        return mappingUtils.mapToGenderDto(genderService.getGenderById(id));
    }

    @PostMapping
    public Gender createGender(@RequestBody GenderDTO gender) {
        return genderService.createGender(mappingUtils.mapToGenderEntity(gender));
    }

    @PutMapping("/{id}")
    public Gender updateGender(@PathVariable Long id, @RequestParam GenderDTO gender) {
        gender.setId(id);
        return genderService.updateGender(mappingUtils.mapToGenderEntity(gender));
    }

    @DeleteMapping("/{id}")
    public void deleteGender(@PathVariable Long id) {
        genderService.deleteGender(id);
    }
}
