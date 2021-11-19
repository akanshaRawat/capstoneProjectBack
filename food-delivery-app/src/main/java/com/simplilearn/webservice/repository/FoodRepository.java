package com.simplilearn.webservice.repository;

import com.simplilearn.webservice.model.Food;

import org.springframework.data.repository.CrudRepository;
public interface FoodRepository extends CrudRepository<Food, Integer>{
	
	public Iterable<Food> deleteByFoodname(String foodname);
	public Food findByFoodname(String foodname);

}