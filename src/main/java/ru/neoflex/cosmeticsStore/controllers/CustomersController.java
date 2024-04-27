package ru.neoflex.cosmeticsStore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ru.neoflex.cosmeticsStore.dto.CustomersDTO;
import ru.neoflex.cosmeticsStore.entities.Customers;
import ru.neoflex.cosmeticsStore.services.CustomersService;
import ru.neoflex.cosmeticsStore.utils.MappingUtils;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/customers")
public class CustomersController {

    private final CustomersService customersService;
    private final MappingUtils mappingUtils;

    @Autowired
    public CustomersController(CustomersService customersService, MappingUtils mappingUtils) {
        this.customersService = customersService;
        this.mappingUtils = mappingUtils;
    }

    @GetMapping
    public List<CustomersDTO> getAllCustomers() {
        return customersService.getAllCustomers().stream()
                .map(mappingUtils::mapToCustomersDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public CustomersDTO getCustomersById(@PathVariable Long id) {
        return mappingUtils.mapToCustomersDto(customersService.getCustomersById(id));
    }

    @PostMapping
    public Customers createCustomers(@RequestBody CustomersDTO customers) {
        return customersService.createCustomers(mappingUtils.mapToCustomersEntity(customers));
    }

    @PutMapping("/{id}")
    public Customers updateCustomers(@PathVariable Long id, @RequestParam CustomersDTO customers) {
        customers.setId(id);
        return customersService.updateCustomers(mappingUtils.mapToCustomersEntity(customers));
    }

    @DeleteMapping("/{id}")
    public void deleteCustomers(@PathVariable Long id) {
        customersService.deleteCustomers(id);
    }

}
