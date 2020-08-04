package com.food.delivery.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.delivery.entity.OrderEntity;
import com.food.delivery.repository.OrderRepository;
import com.food.delivery.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	
    private OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public OrderEntity createOrder(OrderEntity order) {
        return orderRepository.save(order);
    }
}
