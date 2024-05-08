package ru.neoflex.cosmeticsStore.services.impl;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.neoflex.cosmeticsStore.dto.OrderItemsDTO;
import ru.neoflex.cosmeticsStore.entities.OrderItems;
import ru.neoflex.cosmeticsStore.mapping.OrderItemsMapping;
import ru.neoflex.cosmeticsStore.repository.OrderItemsRepository;
import ru.neoflex.cosmeticsStore.services.OrderItemsService;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class OrderItemsServiceImpl implements OrderItemsService {

    private final OrderItemsRepository orderItemsRepository;
    private final OrderItemsMapping mappingUtils;

    @Override
    public List<OrderItemsDTO> getAllOrderItems() {
        return orderItemsRepository.findAll().stream()
                .map(mappingUtils::mapToOrderItemsDto)
                .collect(Collectors.toList());
    }

    @Override
    public OrderItemsDTO getOrderItemsById(Long id) {
        return mappingUtils.mapToOrderItemsDto(orderItemsRepository.findById(id).orElse(null));
    }

    @Override
    @Transactional
    public OrderItems createOrderItems(OrderItemsDTO orderItems) {
        return orderItemsRepository.save(mappingUtils.mapToOrderItemsEntity(orderItems));
    }

    @Override
    @Transactional
    public OrderItems updateOrderItems(OrderItemsDTO orderItems) {
        return orderItemsRepository.save(mappingUtils.mapToOrderItemsEntity(orderItems));
    }

    @Override
    public void deleteOrderItems(Long id) {
        orderItemsRepository.deleteById(id);
    }

}
