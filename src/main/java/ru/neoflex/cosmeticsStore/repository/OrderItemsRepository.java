package ru.neoflex.cosmeticsStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.neoflex.cosmeticsStore.entities.OrderItems;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemsRepository extends JpaRepository<OrderItems, Long> {
}
