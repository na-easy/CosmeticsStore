package ru.neoflex.cosmeticsStore.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import ru.neoflex.cosmeticsStore.dto.OrdersDTO;
import ru.neoflex.cosmeticsStore.entities.Orders;
import ru.neoflex.cosmeticsStore.services.OrdersService;
import ru.neoflex.cosmeticsStore.utils.mapping.OrdersMapping;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrdersController {

    private final OrdersService ordersService;
    private final OrdersMapping mappingUtils;

    @GetMapping
    public List<OrdersDTO> getAllOrders() {
        return ordersService.getAllOrders().stream()
                .map(mappingUtils::mapToOrdersDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public OrdersDTO getOrdersById(@PathVariable Long id) {
        return mappingUtils.mapToOrdersDto(ordersService.getOrdersById(id));
    }

    @PostMapping
    public Orders createOrders(@RequestBody OrdersDTO orders) {
        return ordersService.createOrders(mappingUtils.mapToOrdersEntity(orders));
    }

    @PutMapping("/{id}")
    public Orders updateOrders(@PathVariable Long id, @RequestParam OrdersDTO orders) {
        orders.setId(id);
        return ordersService.updateOrders(mappingUtils.mapToOrdersEntity(orders));
    }

    @DeleteMapping("/{id}")
    public void deleteOrders(@PathVariable Long id) {
        ordersService.deleteOrders(id);
    }
}
