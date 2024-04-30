package ru.neoflex.cosmeticsStore.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;



@Entity
@Table(name = "order_item")
public class OrderItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_item_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Orders orders;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Products products;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "subtotal")
    private Integer subtotal;

    public OrderItems() {
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

    @Override
    public String toString() {
        return "OrderItems{" +
            "id=" + id +
            ", orders='" + orders + '\'' +
            ", products=" + products + '\'' +
            ", quantity=" + quantity + '\'' +
            ", subtotal=" + subtotal +
            '}';
    }
}
