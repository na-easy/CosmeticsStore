package ru.neoflex.cosmeticsStore.services;

import ru.neoflex.cosmeticsStore.entities.Customers;
import ru.neoflex.cosmeticsStore.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomersService {

    private final CustomersRepository customersRepository;

    @Autowired
    public CustomersService(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    public List<Customers> getAllCustomers() {
        return customersRepository.findAll();
    }

    public Customers getCustomersById(Long id) {
        return customersRepository.findById(id).orElse(null);
    }

    public Customers createCustomers(Customers customers) {
        return customersRepository.save(customers);
    }

    public Customers updateCustomers(Customers customers) {
        return customersRepository.save(customers);
    }

    public void deleteCustomers(Long id) {
        customersRepository.deleteById(id);
    }
}
