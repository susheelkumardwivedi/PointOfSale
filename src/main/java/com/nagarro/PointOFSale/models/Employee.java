package com.nagarro.PointOFSale.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyIntializer","handler"})
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String name;
	private String username;
	private String password;
	private int initialDrawerBalance;
	private int currentDrawerBalance;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getInitialDrawerBalance() {
		return initialDrawerBalance;
	}
	public void setInitialDrawerBalance(int initialDrawerBalance) {
		this.initialDrawerBalance = initialDrawerBalance;
	}
	public int getCurrentDrawerBalance() {
		return currentDrawerBalance;
	}
	public void setCurrentDrawerBalance(int currentDrawerBalance) {
		this.currentDrawerBalance = currentDrawerBalance;
	}
	
	

}
