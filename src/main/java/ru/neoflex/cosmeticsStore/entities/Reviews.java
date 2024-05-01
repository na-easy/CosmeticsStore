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
@Table(name = "reviews")
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Products products;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customers customers;

    @Column(name = "rating")
    private Integer rating;

    @Column(name = "comment")
    private String comment;

    public Reviews () {
    }

    public String toString() {
        return "Reviews{" +
                "id=" + id +
                ", products='" + products + '\'' +
                ", customers=" + customers + '\'' +
                ", rating=" + rating + '\'' +
                ", comment=" + comment +
                '}';
    }
}
