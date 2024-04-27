package ru.neoflex.cosmeticsStore.dto;

public class ProductsDTO {

    private Long id;
    private String productName;
    private String brand;
    private Integer price;
    private Integer quantity;

    public ProductsDTO () {
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
}
