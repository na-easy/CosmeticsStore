package ru.neoflex.cosmeticsStore.mapping;

import org.mapstruct.Mapper;
import ru.neoflex.cosmeticsStore.dto.CustomersDTO;
import ru.neoflex.cosmeticsStore.entities.Customers;

@Mapper(componentModel = "spring")
public interface CustomersMapping {
    CustomersDTO mapToCustomersDto(Customers entity);
    Customers mapToCustomersEntity(CustomersDTO dto);
}
