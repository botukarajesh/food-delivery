package com.food.delivery.service;

import com.food.delivery.entity.OrderEntity;

public interface OrderService {
    OrderEntity createOrder(OrderEntity order);
}