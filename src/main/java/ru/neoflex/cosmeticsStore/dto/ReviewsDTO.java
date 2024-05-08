package ru.neoflex.cosmeticsStore.dto;

import lombok.Getter;
import lombok.Setter;

import ru.neoflex.cosmeticsStore.entities.Customers;
import ru.neoflex.cosmeticsStore.entities.Products;

@Setter
@Getter
public class ReviewsDTO {

    private Long id;
    private Products products;
    private Customers customers;
    private Integer rating;
    private String comment;

}
