package com.food.delivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.food.delivery.entity.OrderEntity;
import com.food.delivery.service.OrderService;

@RestController
@RequestMapping("/restaurant/api")
public class OrderFoodController {
	OrderService orderService;

	@Autowired
	public OrderFoodController(OrderService orderService) {
		this.orderService = orderService;
	}

	@PostMapping(value = "/place/order")
	@ResponseStatus(value = HttpStatus.CREATED)
	public OrderEntity createOder(@RequestBody OrderEntity order) {
		return orderService.createOrder(order);
	}
}