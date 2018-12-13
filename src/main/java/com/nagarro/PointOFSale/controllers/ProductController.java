package com.nagarro.PointOFSale.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.PointOFSale.models.Product;
import com.nagarro.PointOFSale.repositories.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepositoy;
	
	@GetMapping
	public List<Product> get() {
		return productRepositoy.findAll();
		
	}
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable("id") String id) {
		long Id=Long.parseLong(id);
		System.out.println(Id);
		Product product = productRepositoy.getOne(Id);
		System.out.println(product.getName());
		return product;
	}
	

}
