package com.example.demo.AreaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.AreaModel.LoginModel;
import com.example.demo.AreaRepository.LoginRepo;

@Service
public class LoginService {
	@Autowired
	private LoginRepo repository;
	public String checkLogin(String username,String password)
	{
		LoginModel user=repository.findByusername(username);
		if(user==null)
		{
			return "No user found";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return "Login Succesfull";
			}
			else
			{
				return "Login Failed";
			}
		}
	}
	public LoginModel addUser(LoginModel area)
	{
		return repository.save(area);
	}
	public List<LoginModel> getUser()
	{
		return repository.findAll();
	}

}
