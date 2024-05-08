package ru.neoflex.cosmeticsStore.services.impl;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.neoflex.cosmeticsStore.dto.CustomersDTO;
import ru.neoflex.cosmeticsStore.entities.Customers;
import ru.neoflex.cosmeticsStore.mapping.CustomersMapping;
import ru.neoflex.cosmeticsStore.repository.CustomersRepository;
import ru.neoflex.cosmeticsStore.services.CustomersService;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CustomersServiceImpl implements CustomersService {

    private final CustomersRepository customersRepository;
    private final CustomersMapping mappingUtils;

    @Override
    public List<CustomersDTO> getAllCustomers() {
        return customersRepository.findAll().stream()
                .map(mappingUtils::mapToCustomersDto)
                .collect(Collectors.toList());
    }

    @Override
    public CustomersDTO getCustomersById(Long id) {
        return mappingUtils.mapToCustomersDto(customersRepository.findById(id).orElse(null));
    }

    @Override
    @Transactional
    public Customers createCustomers(CustomersDTO customers) {
        return customersRepository.save(mappingUtils.mapToCustomersEntity(customers));
    }

    @Override
    @Transactional
    public Customers updateCustomers(CustomersDTO customers) {
        return customersRepository.save(mappingUtils.mapToCustomersEntity(customers));
    }

    @Override
    public void deleteCustomers(Long id) {
        customersRepository.deleteById(id);
    }

}
