package com.ty.bootfoodapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.bootfoodapp.dto.Product;
import com.ty.bootfoodapp.dto.User;
import com.ty.bootfoodapp.repository.ProductRepository;
import com.ty.bootfoodapp.repository.UserRepository;

@Repository
public class UserDao {

	@Autowired
	UserRepository userRepository;

	public User saveUser(User user) {

		return userRepository.save(user);

	}

	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	public User updateUserById(int id, User user) {
		return userRepository.save(user);

	}

	public User getUserById(int id) {
		return userRepository.getById(id);

	}
	
	public User validate(String email, String password ){
		
          return userRepository.validate(email,password);
		
		
	}

}
