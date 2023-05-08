package com.example.demo.AreaModel;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="areas")
public class AreaDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Areaname;
	private String District;
	private int Pincode;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="area_id")
	private AreaDet areaid;
	public int getId() {
		return id;
	}
	public AreaDet getAreaid() {
		return areaid;
	}
	public void setAreaid(AreaDet areaid) {
		this.areaid = areaid;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAreaname() {
		return Areaname;
	}
	public void setAreaname(String areaname) {
		Areaname = areaname;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	@Override
	public String toString() {
		return "AreaDetails [id=" + id + ", Areaname=" + Areaname + ", District=" + District + ", Pincode=" + Pincode
				+ ", areaid=" + areaid + "]";
	}
}
	
