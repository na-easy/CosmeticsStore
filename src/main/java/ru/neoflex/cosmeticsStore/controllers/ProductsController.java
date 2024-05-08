package ru.neoflex.cosmeticsStore.controllers;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;

import ru.neoflex.cosmeticsStore.dto.ProductsDTO;
import ru.neoflex.cosmeticsStore.entities.Products;
import ru.neoflex.cosmeticsStore.services.ProductsService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductsController {

    private final ProductsService productsService;

    @GetMapping
    public List<ProductsDTO> getAllProducts() {
        return productsService.getAllProducts();
    }

    @GetMapping("/{id}")
    public ProductsDTO getProductsById(@PathVariable Long id) {
        return productsService.getProductsById(id);
    }

    @PostMapping
    public Products createProducts(@RequestBody ProductsDTO products) {
        return productsService.createProducts(products);
    }

    @PutMapping("/{id}")
    public Products updateProducts(@PathVariable Long id, @RequestParam ProductsDTO products) {
        products.setId(id);
        return productsService.updateProducts(products);
    }

    @DeleteMapping("/{id}")
    public void deleteProducts(@PathVariable Long id) {
        productsService.deleteProducts(id);
    }
}
