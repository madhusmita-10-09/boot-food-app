package com.ty.bootfoodapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.bootfoodapp.dto.FoodOrder;
import com.ty.bootfoodapp.dto.Product;
import com.ty.bootfoodapp.service.FoodOrderService;
import com.ty.bootfoodapp.service.ProductService;

@RestController
public class FoodOrderController {
	
	@Autowired
	FoodOrderService foodOrderService;
	
	@PostMapping("/foodOrders")
	public FoodOrder saveFoodOrder(@RequestBody FoodOrder foodOrder) {
		
		return foodOrderService.saveFoodOrder(foodOrder);
	}
	
	@GetMapping("/foodOrders")
	public List<FoodOrder> getAllFoodOrder(){
		return foodOrderService.getAllFoodOrder();
	}
	
	@PutMapping("/foodOrders/{id}")
	public FoodOrder updateFoodOrder(@PathVariable int id,@RequestBody FoodOrder foodOrder) {
		return foodOrderService.updateFoodOrder(id,foodOrder);
	}
	
	@GetMapping("/foodOrders/{id}")
	public FoodOrder getFoodOrderById(@PathVariable int id) {
		return foodOrderService.getFoodOrderById(id);
	}
	
	
	/*
	 {

"name":"neeraj",
"phone":9876543,
"cost":12,
   "items":[
  {
   "name":"burger",
   "qty":2,
   "cost":23

  } ,
  {

      "name":"rice",
      "qty":4,
      "cost":25
  }
   


]



} 
	  
	
	 
	 */
	
	
	

}
