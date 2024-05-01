package ru.neoflex.cosmeticsStore.services.impl;

import org.springframework.transaction.annotation.Transactional;
import ru.neoflex.cosmeticsStore.entities.OrderItems;
import ru.neoflex.cosmeticsStore.repository.OrderItemsRepository;
import ru.neoflex.cosmeticsStore.services.OrderItemsService;

import java.util.List;

public class OrderItemsServiceImpl implements OrderItemsService {

    private final OrderItemsRepository orderItemsRepository;

    public OrderItemsServiceImpl(OrderItemsRepository orderItemsRepository) {
        this.orderItemsRepository = orderItemsRepository;
    }

    @Override
    public List<OrderItems> getAllOrderItems() {
        return orderItemsRepository.findAll();
    }

    @Override
    public OrderItems getOrderItemsById(Long id) {
        return orderItemsRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public OrderItems createOrderItems(OrderItems orderItems) {
        return orderItemsRepository.save(orderItems);
    }

    @Override
    @Transactional
    public OrderItems updateOrderItems(OrderItems orderItems) {
        return orderItemsRepository.save(orderItems);
    }

    @Override
    public void deleteOrderItems(Long id) {
        orderItemsRepository.deleteById(id);
    }

}
