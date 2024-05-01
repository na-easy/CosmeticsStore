package ru.neoflex.cosmeticsStore.services;

import ru.neoflex.cosmeticsStore.entities.Gender;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GenderService {

    public List<Gender> getAllGender();
    public Gender getGenderById(Long id);
    public Gender createGender(Gender gender);
    public Gender updateGender(Gender gender);
    public void deleteGender(Long id);

}
