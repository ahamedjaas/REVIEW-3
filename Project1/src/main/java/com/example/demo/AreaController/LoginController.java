package com.example.demo.AreaController;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.AreaModel.LoginModel;
import com.example.demo.AreaService.LoginService;

@RestController
@RequestMapping("/areia")

public class LoginController {
	@Autowired
	private LoginService liservice;
	@PostMapping("/login")
	public String login(@RequestBody Map<String, String>loginData)
	{
		String username=loginData.get("username");
		String password=loginData.get("password");
		String result=liservice.checkLogin(username,password);
		return result;
	}
	@PostMapping("/gin")
	public LoginModel AddUser(@RequestBody LoginModel area)
	{
		return liservice.addUser(area);
	}
	@GetMapping("/log")
	public List<LoginModel>listAll()
	{
		return liservice.getUser();
	}

}
