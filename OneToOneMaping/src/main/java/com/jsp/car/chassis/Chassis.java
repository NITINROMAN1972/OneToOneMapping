package com.jsp.car.chassis;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Chassis {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String chassis_no;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChassis_no() {
		return chassis_no;
	}
	public void setChassis_no(String chassis_no) {
		this.chassis_no = chassis_no;
	}
	
	

}
