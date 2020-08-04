package com.food.delivery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.food.delivery.entity.RestaurantEntity;

@Repository
public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Long>{

	List<RestaurantEntity> findByRating(int rating);
	
	List<RestaurantEntity> findByLocation(String destination);
	
	RestaurantEntity findByName(String name);
}
