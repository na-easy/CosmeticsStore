package ru.neoflex.cosmeticsStore.dto;

import ru.neoflex.cosmeticsStore.entities.Customers;
import ru.neoflex.cosmeticsStore.entities.Products;

public class ReviewsDTO {

    private Long id;
    private Products products;
    private Customers customers;
    private Integer rating;
    private String comment;

    public ReviewsDTO () {
    }

    public Long getId() {
        return id;
    }

    public Products getProducts() {
        return products;
    }

    public Customers getCustomers() {
        return customers;
    }

    public Integer getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
