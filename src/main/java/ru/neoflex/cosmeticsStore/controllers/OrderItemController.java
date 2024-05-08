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

import ru.neoflex.cosmeticsStore.dto.OrderItemsDTO;
import ru.neoflex.cosmeticsStore.entities.OrderItems;
import ru.neoflex.cosmeticsStore.services.OrderItemsService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order_item")
public class OrderItemController {

    private final OrderItemsService orderItemsService;

    @GetMapping
    public List<OrderItemsDTO> getAllOrderItems() {
        return orderItemsService.getAllOrderItems();
    }

    @GetMapping("/{id}")
    public OrderItemsDTO getOrderItemsById(@PathVariable Long id) {
        return orderItemsService.getOrderItemsById(id);
    }

    @PostMapping
    public OrderItems createOrderItems(@RequestBody OrderItemsDTO orderItems) {
        return orderItemsService.createOrderItems(orderItems);
    }

    @PutMapping("/{id}")
    public OrderItems updateOrderItems(@PathVariable Long id, @RequestParam OrderItemsDTO orderItems) {
        orderItems.setId(id);
        return orderItemsService.updateOrderItems(orderItems);
    }

    @DeleteMapping("/{id}")
    public void deleteOrderItems(@PathVariable Long id) {
        orderItemsService.deleteOrderItems(id);
    }
}
