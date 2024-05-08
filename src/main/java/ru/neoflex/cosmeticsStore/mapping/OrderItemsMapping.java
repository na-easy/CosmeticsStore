package ru.neoflex.cosmeticsStore.mapping;

import org.mapstruct.Mapper;
import ru.neoflex.cosmeticsStore.dto.OrderItemsDTO;
import ru.neoflex.cosmeticsStore.entities.OrderItems;

@Mapper(componentModel = "spring")
public interface OrderItemsMapping {
    OrderItemsDTO mapToOrderItemsDto(OrderItems entity);
    OrderItems mapToOrderItemsEntity(OrderItemsDTO dto);
}
