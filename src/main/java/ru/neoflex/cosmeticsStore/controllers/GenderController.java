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

import ru.neoflex.cosmeticsStore.dto.GenderDTO;
import ru.neoflex.cosmeticsStore.entities.Gender;
import ru.neoflex.cosmeticsStore.services.GenderService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/gender")
public class GenderController {

    private final GenderService genderService;

    @GetMapping
    public List<GenderDTO> getAllGender() {
        return genderService.getAllGender();
    }

    @GetMapping("/{id}")
    public GenderDTO getGenderById(@PathVariable Long id) {
        return genderService.getGenderById(id);
    }

    @PostMapping
    public Gender createGender(@RequestBody GenderDTO gender) {
        return genderService.createGender(gender);
    }

    @PutMapping("/{id}")
    public Gender updateGender(@PathVariable Long id, @RequestParam GenderDTO gender) {
        gender.setId(id);
        return genderService.updateGender(gender);
    }

    @DeleteMapping("/{id}")
    public void deleteGender(@PathVariable Long id) {
        genderService.deleteGender(id);
    }
}
