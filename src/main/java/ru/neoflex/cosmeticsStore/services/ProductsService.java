package ru.neoflex.cosmeticsStore.services;

import ru.neoflex.cosmeticsStore.dto.ProductsDTO;
import ru.neoflex.cosmeticsStore.entities.Products;

import java.util.List;

public interface ProductsService {

    List<ProductsDTO> getAllProducts();
    ProductsDTO getProductsById(Long id);
    Products createProducts(ProductsDTO products);
    Products updateProducts(ProductsDTO products);
    void deleteProducts(Long id);

}
