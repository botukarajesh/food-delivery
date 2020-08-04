package com.food.delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.delivery.entity.RestaurantEntity;
import com.food.delivery.service.RestaurantService;

@RestController
@RequestMapping("/restaurant/api")
public class RestaurantController {
	
	RestaurantService restaurantService;

	@Autowired
	public RestaurantController(RestaurantService restaurantService) {
		this.restaurantService = restaurantService;
	}
	
	@GetMapping(value="/restaurants")
	public List<RestaurantEntity> getAllRestaurants(){
		return restaurantService.allRestaurants();
	}
	
	@GetMapping(value="/restaurant/byRating/{rating}")
	public List<RestaurantEntity> searchRestaurantByRating(@PathVariable int rating) {
		return restaurantService.searchByRating(rating);		
	}
	
	@GetMapping(value="/restaurant/byDestination/{destination}")
	public List<RestaurantEntity> searchRestaurantByRating(@PathVariable String destination) {
		return restaurantService.searchByDestination(destination);		
	}
	
}