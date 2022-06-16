package com.ty.bootfoodapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.ty.bootfoodapp.dao.ProductDao;
import com.ty.bootfoodapp.dto.FoodOrder;
import com.ty.bootfoodapp.dto.Product;

@Service
public class ProductService {
	
	@Autowired
	ProductDao productDao;
public Product saveProduct(Product product) {
		
		return productDao.saveProduct(product);	
	}

public List<Product> getAllProduct(){
	return  productDao.getAllProduct();
}

public Product updateProduct( int id, Product product) {
	return productDao.updateProductById(id, product);
}

public Product getProductById(int id) {
	
	return productDao.getProductById(id);
	
}


}
