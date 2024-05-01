package ru.neoflex.cosmeticsStore.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import ru.neoflex.cosmeticsStore.dto.ProductsDTO;
import ru.neoflex.cosmeticsStore.entities.Products;
import ru.neoflex.cosmeticsStore.services.ProductsService;
import ru.neoflex.cosmeticsStore.utils.MappingUtils;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductsController {

    private final ProductsService productsService;
    private final MappingUtils mappingUtils;

    @GetMapping
    public List<ProductsDTO> getAllProducts() {
        return productsService.getAllProducts().stream()
                .map(mappingUtils::mapToProductsDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ProductsDTO getProductsById(@PathVariable Long id) {
        return mappingUtils.mapToProductsDto(productsService.getProductsById(id));
    }

    @PostMapping
    public Products createProducts(@RequestBody ProductsDTO products) {
        return productsService.createProducts(mappingUtils.mapToProductsEntity(products));
    }

    @PutMapping("/{id}")
    public Products updateProducts(@PathVariable Long id, @RequestParam ProductsDTO products) {
        products.setId(id);
        return productsService.updateProducts(mappingUtils.mapToProductsEntity(products));
    }

    @DeleteMapping("/{id}")
    public void deleteProducts(@PathVariable Long id) {
        productsService.deleteProducts(id);
    }
}
