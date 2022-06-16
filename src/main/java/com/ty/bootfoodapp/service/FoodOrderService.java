package com.ty.bootfoodapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.bootfoodapp.dao.FoodOrderDao;
import com.ty.bootfoodapp.dto.FoodOrder;
import com.ty.bootfoodapp.dto.Item;

@Service
public class FoodOrderService {

	@Autowired
	FoodOrderDao foodOrderDao;

	public FoodOrder saveFoodOrder(FoodOrder foodOrder) {

		List<Item> items = foodOrder.getItems();
		double cost = 0;
		for (Item item : items) {
			item.setFoodOrder(foodOrder);
			cost = cost + item.getCost() * item.getQty();
			foodOrder.setCost(cost);
		}

		return foodOrderDao.saveFoodOrder(foodOrder);
	}

	public List<FoodOrder> getAllFoodOrder() {
		return foodOrderDao.getAllFoodOrder();
	}

	public FoodOrder updateFoodOrder(int id, FoodOrder foodOrder) {
		return foodOrderDao.updateFoodOrderById(id, foodOrder);
	}

	public FoodOrder getFoodOrderById(int id) {

		return foodOrderDao.getFoodOrderById(id);

	}

}
