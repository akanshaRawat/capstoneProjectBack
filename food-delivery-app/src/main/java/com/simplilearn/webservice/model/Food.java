package com.simplilearn.webservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FoodTable")
public class Food {
	
	@Id
	
	
	private int id;	
	private String foodname;

	private int  foodprice;
	
	

	public Food() {
		super();
	}

	public Food(int id, String foodname, int foodprice) {
		super();
		this.id = id;
		this.foodname = foodname;
		this.foodprice = foodprice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public int getFoodprice() {
		return foodprice;
	}

	public void setFoodprice(int foodprice) {
		this.foodprice = foodprice;
	}
	
	
	
	

}
