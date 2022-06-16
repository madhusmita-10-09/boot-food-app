package com.ty.bootfoodapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.bootfoodapp.dto.Product;
import com.ty.bootfoodapp.service.ProductService;

@RestController
public class ProductController {
	
	
	@Autowired
	ProductService  productService;
	
	@PostMapping("/products")
	public Product saveProduct(@RequestBody Product product) {
		
		return productService.saveProduct(product);	
	}
	
	@GetMapping("/products")
	public List<Product> getAllProduct(){
		return productService.getAllProduct();
	}
	
	@PutMapping("/product/{id}")
	public Product updateProduct(@PathVariable int id,@RequestBody Product product) {
		return productService.updateProduct(id, product);
	}
	
	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable int id) {
		return productService.getProductById(id);
	}
	
	
	

}
