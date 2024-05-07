package ru.neoflex.cosmeticsStore.utils.mapping;

import org.mapstruct.Mapper;
import ru.neoflex.cosmeticsStore.dto.OrdersDTO;
import ru.neoflex.cosmeticsStore.entities.Orders;

@Mapper(componentModel = "spring")
public interface OrdersMapping {
    OrdersDTO mapToOrdersDto(Orders entity);
    Orders mapToOrdersEntity(OrdersDTO dto);
}
