package ru.neoflex.cosmeticsStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.neoflex.cosmeticsStore.entities.Reviews;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewsRepository extends JpaRepository<Reviews, Long> {
}
