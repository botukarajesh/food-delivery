package com.food.delivery.service;

import java.util.List;

import com.food.delivery.entity.MenuItemEntity;

public interface MenuService {

	List<MenuItemEntity> getMenuByRestaurant(String restaurant);
	
	List<MenuItemEntity> getMenuByFoodName(String foodName);
	
}
