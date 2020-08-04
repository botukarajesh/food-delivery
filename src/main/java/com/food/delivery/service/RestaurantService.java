package com.food.delivery.service;

import java.util.List;

import com.food.delivery.entity.RestaurantEntity;

public interface RestaurantService {
	
	 List<RestaurantEntity> allRestaurants();
	 
	 List<RestaurantEntity> searchByRating(int rating);

	 List<RestaurantEntity> searchByDestination(String destination);
}
