package com.ty.bootfoodapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.bootfoodapp.dto.FoodOrder;
import com.ty.bootfoodapp.dto.Item;
import com.ty.bootfoodapp.repository.FoodOrderRepository;

@Repository
public class FoodOrderDao {
	
	@Autowired
	FoodOrderRepository foodOrderRepository;
	public FoodOrder saveFoodOrder(FoodOrder foodOrder) {
		
		return foodOrderRepository.save(foodOrder);
		
	}
	
	public List<FoodOrder> getAllFoodOrder(){
		
		
		return  foodOrderRepository.findAll();
	}
	
	
	public FoodOrder updateFoodOrderById( int id,FoodOrder foodOrder) {
		return foodOrderRepository.save(foodOrder);
		
	}
	
	public FoodOrder getFoodOrderById(int id) {
		return foodOrderRepository.getById(id);
		
		
	}
		

}
