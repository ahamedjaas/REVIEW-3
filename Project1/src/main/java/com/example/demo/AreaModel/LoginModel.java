package com.example.demo.AreaModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LoginModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Override
	public String toString() {
		return "LoginModel [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String username;
	private String password;
	

}
