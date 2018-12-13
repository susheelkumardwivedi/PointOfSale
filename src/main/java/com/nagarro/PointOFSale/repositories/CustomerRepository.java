package com.nagarro.PointOFSale.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.PointOFSale.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{

}
