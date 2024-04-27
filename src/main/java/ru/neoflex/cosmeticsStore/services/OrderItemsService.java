package ru.neoflex.cosmeticsStore.services;

import ru.neoflex.cosmeticsStore.entities.OrderItems;
import ru.neoflex.cosmeticsStore.repository.OrderItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemsService {

    private final OrderItemsRepository orderItemsRepository;

    @Autowired
    public OrderItemsService(OrderItemsRepository orderItemsRepository) {
        this.orderItemsRepository = orderItemsRepository;
    }

    public List<OrderItems> getAllOrderItems() {
        return orderItemsRepository.findAll();
    }

    public OrderItems getOrderItemsById(Long id) {
        return orderItemsRepository.findById(id).orElse(null);
    }

    public OrderItems createOrderItems(OrderItems orderItems) {
        return orderItemsRepository.save(orderItems);
    }

    public OrderItems updateOrderItems(OrderItems orderItems) {
        return orderItemsRepository.save(orderItems);
    }

    public void deleteOrderItems(Long id) {
        orderItemsRepository.deleteById(id);
    }
}
