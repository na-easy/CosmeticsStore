package ru.neoflex.cosmeticsStore.services;

import ru.neoflex.cosmeticsStore.dto.CustomersDTO;
import ru.neoflex.cosmeticsStore.entities.Customers;

import java.util.List;

public interface CustomersService {

    List<CustomersDTO> getAllCustomers();
    CustomersDTO getCustomersById(Long id);
    Customers createCustomers(CustomersDTO customers);
    Customers updateCustomers(CustomersDTO customers);
    void deleteCustomers(Long id);

}
