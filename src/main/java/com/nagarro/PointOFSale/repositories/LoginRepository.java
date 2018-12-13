package com.nagarro.PointOFSale.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.PointOFSale.models.Employee;



public interface LoginRepository extends JpaRepository<Employee,Long>{
  
	List<Employee> findByUsernameAndPassword(String username,String password);
	
}
