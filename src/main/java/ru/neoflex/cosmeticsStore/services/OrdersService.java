package ru.neoflex.cosmeticsStore.services;

import ru.neoflex.cosmeticsStore.dto.OrdersDTO;
import ru.neoflex.cosmeticsStore.entities.Orders;

import java.util.List;

public interface OrdersService {

    List<OrdersDTO> getAllOrders();
    OrdersDTO getOrdersById(Long id);
    Orders createOrders(OrdersDTO orderItems);
    Orders updateOrders(OrdersDTO orderItems);
    void deleteOrders(Long id);

}
