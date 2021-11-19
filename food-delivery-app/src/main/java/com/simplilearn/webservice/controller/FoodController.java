package com.simplilearn.webservice.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.simplilearn.webservice.Service.FoodService;
import com.simplilearn.webservice.model.Food;

@org.springframework.web.bind.annotation.RestController
public class FoodController {
	
	@Autowired
	private FoodService fservice;
	
	@PostMapping("/save-food")
	@Transactional
	public String registerFood(@RequestBody Food food) {
		fservice.saveMyFood(food);
		return "Hello "+ food.getFoodname()+" has been added to the list";
		
	}

	@GetMapping("/all-foods")
		public Iterable<Food> showAllFoods(){
			
			return fservice.showAllFoods();
		}
	
	@GetMapping("/delete/{foodname}")
	@Transactional
	public Iterable<Food> deleteFood(@PathVariable String foodname){
		
		return fservice.deleteFoodByFoodname(foodname);
	}
	
	@GetMapping("/search/{foodname}")
	public Food searchFood(@PathVariable String foodname) {
		return fservice.findByFoodname(foodname);
		
	}
}
