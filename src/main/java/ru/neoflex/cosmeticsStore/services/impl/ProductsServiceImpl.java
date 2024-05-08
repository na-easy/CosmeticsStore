package ru.neoflex.cosmeticsStore.services.impl;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.neoflex.cosmeticsStore.dto.ProductsDTO;
import ru.neoflex.cosmeticsStore.entities.Products;
import ru.neoflex.cosmeticsStore.mapping.ProductsMapping;
import ru.neoflex.cosmeticsStore.repository.ProductsRepository;
import ru.neoflex.cosmeticsStore.services.ProductsService;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ProductsServiceImpl implements ProductsService {

    private final ProductsRepository productsRepository;
    private final ProductsMapping mappingUtils;

    @Override
    public List<ProductsDTO> getAllProducts() {
        return productsRepository.findAll().stream()
                .map(mappingUtils::mapToProductsDto)
                .collect(Collectors.toList());
    }

    @Override
    public ProductsDTO getProductsById(Long id) {
        return mappingUtils.mapToProductsDto(productsRepository.findById(id).orElse(null));
    }

    @Override
    @Transactional
    public Products createProducts(ProductsDTO products) {
        return productsRepository.save(mappingUtils.mapToProductsEntity(products));
    }

    @Override
    @Transactional
    public Products updateProducts(ProductsDTO products) {
        return productsRepository.save(mappingUtils.mapToProductsEntity(products));
    }

    @Override
    public void deleteProducts(Long id) {
        productsRepository.deleteById(id);
    }
}
