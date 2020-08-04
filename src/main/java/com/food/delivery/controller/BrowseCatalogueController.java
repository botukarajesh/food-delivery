package com.food.delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.delivery.entity.MenuItemEntity;
import com.food.delivery.service.MenuService;

@RestController
@RequestMapping("/restaurant/api")
public class BrowseCatalogueController {
	
	MenuService menuService;

	@Autowired
	public BrowseCatalogueController(MenuService menuService) {
		this.menuService = menuService;
	}
	
	@GetMapping(value="/getMenu/{restaurant}")
	public List<MenuItemEntity> getMenu(@PathVariable String restaurant){
		return menuService.getMenuByRestaurant(restaurant);
	}
	
	@GetMapping(value="/getMenu/food/{foodItemName}")
	public List<MenuItemEntity> getMenuByFoodName(@PathVariable String foodItemName){
		return menuService.getMenuByFoodName(foodItemName);
	}

}
