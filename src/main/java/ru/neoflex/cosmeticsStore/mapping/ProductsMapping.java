package ru.neoflex.cosmeticsStore.mapping;

import org.mapstruct.Mapper;
import ru.neoflex.cosmeticsStore.dto.ProductsDTO;
import ru.neoflex.cosmeticsStore.entities.Products;

@Mapper(componentModel = "spring")
public interface ProductsMapping {
    ProductsDTO mapToProductsDto(Products entity);
    Products mapToProductsEntity(ProductsDTO dto);
}
