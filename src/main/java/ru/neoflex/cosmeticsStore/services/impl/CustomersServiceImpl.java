package ru.neoflex.cosmeticsStore.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.neoflex.cosmeticsStore.entities.Customers;
import ru.neoflex.cosmeticsStore.repository.CustomersRepository;
import ru.neoflex.cosmeticsStore.services.CustomersService;

import java.util.List;

@Service
public class CustomersServiceImpl implements CustomersService {

    private final CustomersRepository customersRepository;

    public CustomersServiceImpl(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    @Override
    public List<Customers> getAllCustomers() {
        return customersRepository.findAll();
    }

    @Override
    public Customers getCustomersById(Long id) {
        return customersRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Customers createCustomers(Customers customers) {
        return customersRepository.save(customers);
    }

    @Override
    @Transactional
    public Customers updateCustomers(Customers customers) {
        return customersRepository.save(customers);
    }

    @Override
    public void deleteCustomers(Long id) {
        customersRepository.deleteById(id);
    }

}
