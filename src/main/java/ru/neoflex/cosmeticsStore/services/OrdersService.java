package ru.neoflex.cosmeticsStore.services;

import ru.neoflex.cosmeticsStore.entities.Orders;

import java.util.List;

public interface OrdersService {

    public List<Orders> getAllOrders();
    public Orders getOrdersById(Long id);
    public Orders createOrders(Orders orderItems);
    public Orders updateOrders(Orders orderItems);
    public void deleteOrders(Long id);

}
