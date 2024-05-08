package ru.neoflex.cosmeticsStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.neoflex.cosmeticsStore.entities.Orders;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {
}
