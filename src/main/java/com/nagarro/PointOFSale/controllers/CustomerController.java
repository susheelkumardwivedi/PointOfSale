package com.nagarro.PointOFSale.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.PointOFSale.models.Customer;
import com.nagarro.PointOFSale.repositories.CustomerRepository;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepositoy;

	@GetMapping
	public List<Customer> get() {
		return customerRepositoy.findAll();

	}

}
