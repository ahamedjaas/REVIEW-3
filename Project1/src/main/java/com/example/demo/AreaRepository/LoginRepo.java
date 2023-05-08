package com.example.demo.AreaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.AreaModel.LoginModel;

public interface LoginRepo extends JpaRepository<LoginModel,Integer>{
	LoginModel findByusername(String username);

}
