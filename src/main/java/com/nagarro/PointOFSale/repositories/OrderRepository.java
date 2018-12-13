package com.nagarro.PointOFSale.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.PointOFSale.models.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
