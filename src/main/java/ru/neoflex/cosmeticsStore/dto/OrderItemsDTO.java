package ru.neoflex.cosmeticsStore.dto;

import lombok.Getter;
import lombok.Setter;

import ru.neoflex.cosmeticsStore.entities.Orders;
import ru.neoflex.cosmeticsStore.entities.Products;

@Setter
@Getter
public class OrderItemsDTO {

    private Long id;
    private Orders orders;
    private Products products;
    private Integer quantity;
    private Integer subtotal;

}
