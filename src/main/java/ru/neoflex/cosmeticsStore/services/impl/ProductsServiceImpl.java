package ru.neoflex.cosmeticsStore.services.impl;

import org.springframework.transaction.annotation.Transactional;
import ru.neoflex.cosmeticsStore.entities.Products;
import ru.neoflex.cosmeticsStore.repository.ProductsRepository;
import ru.neoflex.cosmeticsStore.services.ProductsService;

import java.util.List;

public class ProductsServiceImpl implements ProductsService {

    private final ProductsRepository productsRepository;

    public ProductsServiceImpl(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @Override
    public List<Products> getAllProducts() {
        return productsRepository.findAll();
    }

    @Override
    public Products getProductsById(Long id) {
        return productsRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Products createProducts(Products products) {
        return productsRepository.save(products);
    }

    @Override
    @Transactional
    public Products updateProducts(Products products) {
        return productsRepository.save(products);
    }

    @Override
    public void deleteProducts(Long id) {
        productsRepository.deleteById(id);
    }
}
