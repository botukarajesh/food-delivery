package com.food.delivery.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.delivery.entity.MenuItemEntity;
import com.food.delivery.entity.RestaurantEntity;
import com.food.delivery.repository.MenuItemRepository;
import com.food.delivery.repository.RestaurantRepository;
import com.food.delivery.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService{
	
	private MenuItemRepository menuItemRepository;
	
	private RestaurantRepository restaurantRepository;
	
	@Autowired
	public MenuServiceImpl(MenuItemRepository menuItemRepository, RestaurantRepository restaurantRepository) {
		this.menuItemRepository = menuItemRepository;
		this.restaurantRepository = restaurantRepository;
	}

	@Override
	public List<MenuItemEntity> getMenuByRestaurant(String restaurant) {
		 RestaurantEntity findByName = restaurantRepository.findByName(restaurant);
		 List<MenuItemEntity> menu = findByName.getMenu();
		 return menu;
	}

	@Override
	public List<MenuItemEntity> getMenuByFoodName(String foodName) {
		return menuItemRepository.findByName(foodName);
	
	}

}
