package ru.neoflex.cosmeticsStore.dto;

import ru.neoflex.cosmeticsStore.entities.Orders;
import ru.neoflex.cosmeticsStore.entities.Products;

public class OrderItemsDTO {

    private Long id;
    private Orders orders;
    private Products products;
    private Integer quantity;
    private Integer subtotal;

    public OrderItemsDTO () {
    }

    public Long getId() {
        return id;
    }

    public Orders getOrders() {
        return orders;
    }

    public Products getProducts() {
        return products;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getSubtotal() {
        return subtotal;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setSubtotal(Integer subtotal) {
        this.subtotal = subtotal;
    }
}
