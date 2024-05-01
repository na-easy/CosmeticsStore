package ru.neoflex.cosmeticsStore.utils;

import org.springframework.stereotype.Service;

import ru.neoflex.cosmeticsStore.dto.*;
import ru.neoflex.cosmeticsStore.entities.*;

@Service
public class MappingUtils {

    public CustomersDTO mapToCustomersDto(Customers entity){
        CustomersDTO dto = new CustomersDTO();
        dto.setId(entity.getId());
        dto.setFirstName(entity.getFirstName());
        dto.setLastName(entity.getLastName());
        dto.setEmail(entity.getEmail());
        dto.setPhoneNumber(entity.getPhoneNumber());
        return dto;
    }

    public Customers mapToCustomersEntity(CustomersDTO dto){
        Customers entity = new Customers();
        entity.setId(dto.getId());
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setEmail(dto.getEmail());
        entity.setPhoneNumber(dto.getPhoneNumber());
        return entity;
    }

    public GenderDTO mapToGenderDto(Gender entity){
        GenderDTO dto = new GenderDTO();
        dto.setId(entity.getId());
        dto.setDescription(entity.getDescription());
        return dto;
    }

    public Gender mapToGenderEntity(GenderDTO dto){
        Gender entity = new Gender();
        entity.setId(dto.getId());
        entity.setDescription(dto.getDescription());
        return entity;
    }

    public OrderItemsDTO mapToOrderItemsDto(OrderItems entity){
        OrderItemsDTO dto = new OrderItemsDTO();
        dto.setId(entity.getId());
        dto.setOrders(entity.getOrders());
        dto.setProducts(entity.getProducts());
        dto.setQuantity(entity.getQuantity());
        dto.setSubtotal(entity.getSubtotal());
        return dto;
    }

    public OrderItems mapToOrderItemsEntity(OrderItemsDTO dto){
        OrderItems entity = new OrderItems();
        entity.setId(dto.getId());
        entity.setOrders(dto.getOrders());
        entity.setProducts(dto.getProducts());
        entity.setQuantity(dto.getQuantity());
        entity.setSubtotal(dto.getSubtotal());
        return entity;
    }

    public OrdersDTO mapToOrdersDto(Orders entity){
        OrdersDTO dto = new OrdersDTO();
        dto.setId(entity.getId());
        dto.setCustomers(entity.getCustomers());
        dto.setOrderDate(entity.getOrderDate());
        dto.setTotalAmount(entity.getTotalAmount());
        dto.setStatus(entity.getStatus());
        return dto;
    }

    public Orders mapToOrdersEntity(OrdersDTO dto){
        Orders entity = new Orders();
        entity.setId(dto.getId());
        entity.setCustomers(dto.getCustomers());
        entity.setOrderDate(dto.getOrderDate());
        entity.setTotalAmount(dto.getTotalAmount());
        entity.setStatus(dto.getStatus());
        return entity;
    }

    public ProductsDTO mapToProductsDto(Products entity){
        ProductsDTO dto = new ProductsDTO();
        dto.setId(entity.getId());
        dto.setProductName(entity.getProductName());
        dto.setBrand(entity.getBrand());
        dto.setPrice(entity.getPrice());
        dto.setQuantity(entity.getQuantity());
        return dto;
    }

    public Products mapToProductsEntity(ProductsDTO dto){
        Products entity = new Products();
        entity.setId(dto.getId());
        entity.setProductName(dto.getProductName());
        entity.setBrand(dto.getBrand());
        entity.setPrice(dto.getPrice());
        entity.setQuantity(dto.getQuantity());
        return entity;
    }

    public ReviewsDTO mapToReviewsDto(Reviews entity){
        ReviewsDTO dto = new ReviewsDTO();
        dto.setId(entity.getId());
        dto.setProducts(entity.getProducts());
        dto.setCustomers(entity.getCustomers());
        dto.setRating(entity.getRating());
        dto.setComment(entity.getComment());
        return dto;
    }

    public Reviews mapToReviewsEntity(ReviewsDTO dto){
        Reviews entity = new Reviews();
        entity.setId(dto.getId());
        entity.setProducts(dto.getProducts());
        entity.setCustomers(dto.getCustomers());
        entity.setRating(dto.getRating());
        entity.setComment(dto.getComment());
        return entity;
    }
}
