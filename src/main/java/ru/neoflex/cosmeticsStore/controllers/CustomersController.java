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

import ru.neoflex.cosmeticsStore.dto.CustomersDTO;
import ru.neoflex.cosmeticsStore.entities.Customers;
import ru.neoflex.cosmeticsStore.services.CustomersService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customers")
public class CustomersController {

    private final CustomersService customersService;

    @GetMapping
    public List<CustomersDTO> getAllCustomers() {
        return customersService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public CustomersDTO getCustomersById(@PathVariable Long id) {
        return customersService.getCustomersById(id);
    }

    @PostMapping
    public Customers createCustomers(@RequestBody CustomersDTO customers) {
        return customersService.createCustomers(customers);
    }

    @PutMapping("/{id}")
    public Customers updateCustomers(@PathVariable Long id, @RequestParam CustomersDTO customers) {
        customers.setId(id);
        return customersService.updateCustomers(customers);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomers(@PathVariable Long id) {
        customersService.deleteCustomers(id);
    }

}
