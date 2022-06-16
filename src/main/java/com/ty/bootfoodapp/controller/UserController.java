package com.ty.bootfoodapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.bootfoodapp.dto.Login;
import com.ty.bootfoodapp.dto.Product;
import com.ty.bootfoodapp.dto.User;
import com.ty.bootfoodapp.service.ProductService;
import com.ty.bootfoodapp.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {

		return userService.saveUser(user);
	}

	@GetMapping("/users")
	public List<User> getAllUser() {
		return userService.getAllUser();
	}

	@PutMapping("/users/{id}")
	public User updateUser(@PathVariable int id, @RequestBody User user) {
		return userService.updateUser(id, user);
	}

	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}
	@PostMapping("/users/{id}")
	public User validate(@RequestBody Login login) {
		return  userService.validate(login.getEmail(),login.getPassword());
	}

}
