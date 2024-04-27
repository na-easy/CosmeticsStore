package ru.neoflex.cosmeticsStore.services;

import ru.neoflex.cosmeticsStore.entities.Products;
import ru.neoflex.cosmeticsStore.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

    private final ProductsRepository productsRepository;

    @Autowired
    public ProductsService(ProductsRepository ordersRepository) {
        this.productsRepository = ordersRepository;
    }

    public List<Products> getAllProducts() {
        return productsRepository.findAll();
    }

    public Products getProductsById(Long id) {
        return productsRepository.findById(id).orElse(null);
    }

    public Products createProducts(Products products) {
        return productsRepository.save(products);
    }

    public Products updateProducts(Products products) {
        return productsRepository.save(products);
    }

    public void deleteProducts(Long id) {
        productsRepository.deleteById(id);
    }
}
