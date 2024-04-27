package ru.neoflex.cosmeticsStore.dto;

import ru.neoflex.cosmeticsStore.entities.Customers;

public class OrdersDTO {

    private Long id;
    private Customers customers;
    private String orderDate;
    private Integer totalAmount;
    private String status;

    public OrdersDTO () {
    }

    public Long getId() {
        return id;
    }

    public Customers getCustomers() {
        return customers;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
