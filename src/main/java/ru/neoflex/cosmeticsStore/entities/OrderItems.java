package ru.neoflex.cosmeticsStore.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
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
