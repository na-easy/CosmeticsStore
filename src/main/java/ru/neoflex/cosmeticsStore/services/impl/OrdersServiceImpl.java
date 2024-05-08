package ru.neoflex.cosmeticsStore.services.impl;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.neoflex.cosmeticsStore.dto.OrdersDTO;
import ru.neoflex.cosmeticsStore.entities.Orders;
import ru.neoflex.cosmeticsStore.mapping.OrdersMapping;
import ru.neoflex.cosmeticsStore.repository.OrdersRepository;
import ru.neoflex.cosmeticsStore.services.OrdersService;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class OrdersServiceImpl implements OrdersService {

    private final OrdersRepository ordersRepository;
    private final OrdersMapping mappingUtils;

    @Override
    public List<OrdersDTO> getAllOrders() {
        return ordersRepository.findAll().stream()
                .map(mappingUtils::mapToOrdersDto)
                .collect(Collectors.toList());
    }

    @Override
    public OrdersDTO getOrdersById(Long id) {
        return mappingUtils.mapToOrdersDto(ordersRepository.findById(id).orElse(null));
    }

    @Override
    @Transactional
    public Orders createOrders(OrdersDTO orderItems) {
        return ordersRepository.save(mappingUtils.mapToOrdersEntity(orderItems));
    }

    @Override
    @Transactional
    public Orders updateOrders(OrdersDTO orderItems) {
        return ordersRepository.save(mappingUtils.mapToOrdersEntity(orderItems));
    }

    @Override
    public void deleteOrders(Long id) {
        ordersRepository.deleteById(id);
    }

}
