package ru.neoflex.cosmeticsStore.services;

import ru.neoflex.cosmeticsStore.entities.Customers;

import java.util.List;

public interface CustomersService {

    public List<Customers> getAllCustomers();
    public Customers getCustomersById(Long id);
    public Customers createCustomers(Customers customers);
    public Customers updateCustomers(Customers customers);
    public void deleteCustomers(Long id);

}
