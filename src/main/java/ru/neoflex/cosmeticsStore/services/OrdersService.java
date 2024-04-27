package ru.neoflex.cosmeticsStore.services;

import ru.neoflex.cosmeticsStore.entities.Orders;
import ru.neoflex.cosmeticsStore.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {

    private final OrdersRepository ordersRepository;

    @Autowired
    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    public List<Orders> getAllOrders() {
        return ordersRepository.findAll();
    }

    public Orders getOrdersById(Long id) {
        return ordersRepository.findById(id).orElse(null);
    }

    public Orders createOrders(Orders orderItems) {
        return ordersRepository.save(orderItems);
    }

    public Orders updateOrders(Orders orderItems) {
        return ordersRepository.save(orderItems);
    }

    public void deleteOrders(Long id) {
        ordersRepository.deleteById(id);
    }
}
