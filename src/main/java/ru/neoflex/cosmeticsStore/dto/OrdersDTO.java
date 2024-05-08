package ru.neoflex.cosmeticsStore.dto;

import lombok.Getter;
import lombok.Setter;

import ru.neoflex.cosmeticsStore.entities.Customers;

@Setter
@Getter
public class OrdersDTO {

    private Long id;
    private Customers customers;
    private String orderDate;
    private Integer totalAmount;
    private String status;

}
