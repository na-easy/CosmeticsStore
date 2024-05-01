package ru.neoflex.cosmeticsStore.services;

import ru.neoflex.cosmeticsStore.entities.Customers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomersService {

    public List<Customers> getAllCustomers();
    public Customers getCustomersById(Long id);
    public Customers createCustomers(Customers customers);
    public Customers updateCustomers(Customers customers);
    public void deleteCustomers(Long id);

}
