package ru.neoflex.cosmeticsStore.services;

import ru.neoflex.cosmeticsStore.entities.Products;

import java.util.List;

public interface ProductsService {

    public List<Products> getAllProducts();
    public Products getProductsById(Long id);
    public Products createProducts(Products products);
    public Products updateProducts(Products products);
    public void deleteProducts(Long id);

}
