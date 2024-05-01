package ru.neoflex.cosmeticsStore.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductsDTO {

    private Long id;
    private String productName;
    private String brand;
    private Integer price;
    private Integer quantity;

    public ProductsDTO () {
    }

}
