package com.nagarro.PointOFSale.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.PointOFSale.models.Product;



public interface ProductRepository extends JpaRepository<Product,Long>{
  
	
	
}
