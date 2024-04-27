package ru.neoflex.cosmeticsStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.neoflex.cosmeticsStore.entities.Gender;
import org.springframework.stereotype.Repository;

@Repository
public interface GenderRepository extends JpaRepository<Gender, Long> {
}
