package ru.neoflex.cosmeticsStore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ru.neoflex.cosmeticsStore.dto.OrderItemsDTO;
import ru.neoflex.cosmeticsStore.entities.OrderItems;
import ru.neoflex.cosmeticsStore.services.OrderItemsService;
import ru.neoflex.cosmeticsStore.utils.MappingUtils;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/order_item")
public class OrderItemController {

    private final OrderItemsService orderItemsService;
    private final MappingUtils mappingUtils;

    @Autowired
    public OrderItemController(OrderItemsService orderItemsService, MappingUtils mappingUtils) {
        this.orderItemsService = orderItemsService;
        this.mappingUtils = mappingUtils;
    }

    @GetMapping
    public List<OrderItemsDTO> getAllOrderItems() {
        return orderItemsService.getAllOrderItems().stream()
                .map(mappingUtils::mapToOrderItemsDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public OrderItemsDTO getOrderItemsById(@PathVariable Long id) {
        return mappingUtils.mapToOrderItemsDto(orderItemsService.getOrderItemsById(id));
    }

    @PostMapping
    public OrderItems createOrderItems(@RequestBody OrderItemsDTO orderItems) {
        return orderItemsService.createOrderItems(mappingUtils.mapToOrderItemsEntity(orderItems));
    }

    @PutMapping("/{id}")
    public OrderItems updateOrderItems(@PathVariable Long id, @RequestParam OrderItemsDTO orderItems) {
        orderItems.setId(id);
        return orderItemsService.updateOrderItems(mappingUtils.mapToOrderItemsEntity(orderItems));
    }

    @DeleteMapping("/{id}")
    public void deleteOrderItems(@PathVariable Long id) {
        orderItemsService.deleteOrderItems(id);
    }
}
