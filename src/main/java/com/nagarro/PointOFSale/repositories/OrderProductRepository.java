package com.nagarro.PointOFSale.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.PointOFSale.models.OrderProduct;

public interface OrderProductRepository extends JpaRepository<OrderProduct,Long> {

}
