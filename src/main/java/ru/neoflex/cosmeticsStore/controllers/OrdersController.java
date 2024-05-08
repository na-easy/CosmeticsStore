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

import ru.neoflex.cosmeticsStore.dto.OrdersDTO;
import ru.neoflex.cosmeticsStore.entities.Orders;
import ru.neoflex.cosmeticsStore.services.OrdersService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrdersController {

    private final OrdersService ordersService;

    @GetMapping
    public List<OrdersDTO> getAllOrders() {
        return ordersService.getAllOrders();
    }

    @GetMapping("/{id}")
    public OrdersDTO getOrdersById(@PathVariable Long id) {
        return ordersService.getOrdersById(id);
    }

    @PostMapping
    public Orders createOrders(@RequestBody OrdersDTO orders) {
        return ordersService.createOrders(orders);
    }

    @PutMapping("/{id}")
    public Orders updateOrders(@PathVariable Long id, @RequestParam OrdersDTO orders) {
        orders.setId(id);
        return ordersService.updateOrders(orders);
    }

    @DeleteMapping("/{id}")
    public void deleteOrders(@PathVariable Long id) {
        ordersService.deleteOrders(id);
    }
}
