package com.food.delivery.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.delivery.entity.RestaurantEntity;
import com.food.delivery.repository.RestaurantRepository;
import com.food.delivery.service.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService{

	private RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }
    
	@Override
	public List<RestaurantEntity> allRestaurants() {
		return restaurantRepository.findAll();
	}

	@Override
	public List<RestaurantEntity> searchByRating(int rating) {
		return restaurantRepository.findByRating(rating);
	}

	@Override
	public List<RestaurantEntity> searchByDestination(String destination) {
		return restaurantRepository.findByLocation(destination);
	}

}
