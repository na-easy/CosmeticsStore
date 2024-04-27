package ru.neoflex.cosmeticsStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.neoflex.cosmeticsStore.entities.Products;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {
}
