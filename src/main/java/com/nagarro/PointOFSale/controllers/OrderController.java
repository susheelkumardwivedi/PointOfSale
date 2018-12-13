package com.nagarro.PointOFSale.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.PointOFSale.models.Order;
import com.nagarro.PointOFSale.models.OrderProduct;
import com.nagarro.PointOFSale.models.Product;
import com.nagarro.PointOFSale.repositories.OrderProductRepository;
import com.nagarro.PointOFSale.repositories.OrderRepository;
import com.nagarro.PointOFSale.repositories.ProductRepository;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private OrderProductRepository orderProductRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public long create(@RequestBody Order order) {
		Date d=new Date();
		order.setDate(String.valueOf(d));
		Order savedOrder=orderRepository.saveAndFlush(order);
		return savedOrder.getId();
		
	}
	
	@PostMapping("/product")
	@ResponseStatus(HttpStatus.OK)
	public void createProduct(@RequestBody OrderProduct orderProduct) {
		orderProductRepository.saveAndFlush(orderProduct);
		Order order=orderRepository.getOne(orderProduct.getOrderId());
		if(order.getStatus().equals("done")) {
		Product product=productRepository.getOne(orderProduct.getProductId());
		product.setStock(product.getStock()-orderProduct.getQty());
		productRepository.saveAndFlush(product);
		}
		
		
	}
}
