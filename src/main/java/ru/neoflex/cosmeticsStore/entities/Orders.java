package ru.neoflex.cosmeticsStore.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customers customers;

    @Column(name = "order_date")
    private String orderDate;

    @Column(name = "total_amount")
    private Integer totalAmount;

    @Column(name = "status")
    private String status;

    public Orders () {
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

    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", customers='" + customers + '\'' +
                ", orderDate=" + orderDate + '\'' +
                ", totalAmount=" + totalAmount + '\'' +
                ", status=" + status +
                '}';
    }
}
