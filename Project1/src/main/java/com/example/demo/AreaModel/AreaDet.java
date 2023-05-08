package com.example.demo.AreaModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Belongs")
public class AreaDet {
	@Id
	private int id;
	private String State;
	private String Country;
	private String CountryFood;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	@Override
	public String toString() {
		return "AreaDet [id=" + id + ", State=" + State + ", Country=" + Country + ", CountryFood=" + CountryFood + "]";
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getCountryFood() {
		return CountryFood;
	}
	public void setCountryFood(String countryFood) {
		CountryFood = countryFood;
	}

}
