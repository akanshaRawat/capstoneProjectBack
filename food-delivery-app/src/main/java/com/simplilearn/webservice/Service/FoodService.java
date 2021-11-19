package com.simplilearn.webservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.webservice.model.Food;
import com.simplilearn.webservice.repository.FoodRepository;

@Service
public class FoodService {
	
	@Autowired
	private FoodRepository frepo;
	
	

	public FoodService() {}
		
	
	public FoodService(FoodRepository frepo) {
		super();
		this.frepo = frepo;
	}
	
	public void saveMyFood(Food food) {
		frepo.save(food);
		
	}
	public Iterable<Food> showAllFoods(){
		return frepo.findAll();
	}
	
	public Iterable<Food> deleteFoodByFoodname(String foodname){
		frepo.deleteByFoodname(foodname);
		return frepo.findAll();
	}
	
	public Food findByFoodname(String foodname) {
		
		return frepo.findByFoodname(foodname);
	}
	
	

}
