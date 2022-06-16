package com.ty.bootfoodapp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ty.bootfoodapp.dto.Product;
import com.ty.bootfoodapp.repository.ProductRepository;

@Repository
public class ProductDao {
	
	@Autowired
	ProductRepository productRepository;
	public Product saveProduct(Product product) {
		
		return productRepository.save(product);
		
	}
	
	public List<Product> getAllProduct(){
		return  productRepository.findAll();
	}
	
	
	public Product updateProductById( int id,Product product) {
		return productRepository.save(product);
		
	}
	
	public Product getProductById(int id) {
		return productRepository.getById(id);
		
		
	}
		

}
