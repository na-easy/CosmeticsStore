package ru.neoflex.cosmeticsStore.services.impl;

import org.springframework.transaction.annotation.Transactional;
import ru.neoflex.cosmeticsStore.entities.Orders;
import ru.neoflex.cosmeticsStore.repository.OrdersRepository;
import ru.neoflex.cosmeticsStore.services.OrdersService;

import java.util.List;

public class OrdersServiceImpl implements OrdersService {

    private final OrdersRepository ordersRepository;

    public OrdersServiceImpl(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @Override
    public List<Orders> getAllOrders() {
        return ordersRepository.findAll();
    }

    @Override
    public Orders getOrdersById(Long id) {
        return ordersRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Orders createOrders(Orders orderItems) {
        return ordersRepository.save(orderItems);
    }

    @Override
    @Transactional
    public Orders updateOrders(Orders orderItems) {
        return ordersRepository.save(orderItems);
    }

    @Override
    public void deleteOrders(Long id) {
        ordersRepository.deleteById(id);
    }

}
