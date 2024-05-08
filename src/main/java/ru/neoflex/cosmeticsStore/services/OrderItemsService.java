package ru.neoflex.cosmeticsStore.services;

import ru.neoflex.cosmeticsStore.dto.OrderItemsDTO;
import ru.neoflex.cosmeticsStore.entities.OrderItems;

import java.util.List;

public interface OrderItemsService {

    List<OrderItemsDTO> getAllOrderItems();
    OrderItemsDTO getOrderItemsById(Long id);
    OrderItems createOrderItems(OrderItemsDTO orderItems);
    OrderItems updateOrderItems(OrderItemsDTO orderItems);
    void deleteOrderItems(Long id);

}
