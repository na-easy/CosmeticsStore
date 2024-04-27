package ru.neoflex.cosmeticsStore.entities;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "products_id")
    private Long id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "brand")
    private String brand;

    @Column(name = "price")
    private Integer price;

    @Column(name = "quantity")
    private Integer quantity;

    public Products () {
    }

    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getBrand() {
        return brand;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return "Products{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", brand=" + brand + '\'' +
                ", price=" + price + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
