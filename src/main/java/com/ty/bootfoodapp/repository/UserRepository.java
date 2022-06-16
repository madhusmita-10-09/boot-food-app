package com.ty.bootfoodapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import com.ty.bootfoodapp.dto.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	@Query("SELECT u FROM User u WHERE u.email=:email and u.password=:password")
	public  User validate(@Param("email")String email,@Param("password")String password);
	
	
}
