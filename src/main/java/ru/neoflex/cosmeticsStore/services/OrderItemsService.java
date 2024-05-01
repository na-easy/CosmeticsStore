package ru.neoflex.cosmeticsStore.services;

import ru.neoflex.cosmeticsStore.entities.OrderItems;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderItemsService {

    public List<OrderItems> getAllOrderItems();
    public OrderItems getOrderItemsById(Long id);
    public OrderItems createOrderItems(OrderItems orderItems);
    public OrderItems updateOrderItems(OrderItems orderItems);
    public void deleteOrderItems(Long id);

}
