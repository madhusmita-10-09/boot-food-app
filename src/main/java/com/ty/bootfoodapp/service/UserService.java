package com.ty.bootfoodapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.bootfoodapp.dao.ProductDao;
import com.ty.bootfoodapp.dao.UserDao;
import com.ty.bootfoodapp.dto.Product;
import com.ty.bootfoodapp.dto.User;
@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
public User saveUser(User user) {
		
		return userDao.saveUser(user);
		
	}

public List<User> getAllUser(){
	return  userDao.getAllUser();
}

public User updateUser( int id, User user) {
	return userDao.updateUserById(id, user);
}

public User getUserById(int id) {
	
	return userDao.getUserById(id);
	
}

public User validate(String email, String password) {
	
	return userDao.validate(email, password);
	
}

}
