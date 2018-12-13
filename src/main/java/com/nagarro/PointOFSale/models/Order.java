package com.nagarro.PointOFSale.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="orders") 
@JsonIgnoreProperties({ "hibernateLazyIntializer", "handler" })
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private long custId;
	private long empId;
	private String status;
	private String modeOfPayment;
	private String date;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	
}
