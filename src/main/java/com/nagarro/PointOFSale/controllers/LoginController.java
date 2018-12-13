package com.nagarro.PointOFSale.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.PointOFSale.models.Employee;
import com.nagarro.PointOFSale.repositories.LoginRepository;
import com.nagarro.PointOFSale.Constants;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginRepository loginRepositoy;
	
	@GetMapping("/username/{username}/password/{password}")
	public Employee get(@PathVariable("username") String username,@PathVariable("password") String password) {
		System.out.println("in login"+username+" "+password);
		Employee employee=null;
		System.out.println(loginRepositoy.findAll());
		List<Employee> list=loginRepositoy.findByUsernameAndPassword(username, password);
		System.out.println(list);
		if(list.size()>0) {
			System.out.println(list.get(0));
			employee=list.get(0);
			Constants.id=employee.getId();
			
		}
		else {
			System.out.println("no employee");
		}
		
		return employee;
		
	}
	@GetMapping("/employee/{empId}/balance/{balance}")
	public void setBalance(@PathVariable("empId") String empId,@PathVariable("balance") String balance) {
		long id=Long.parseLong(empId);
		int currBalance=Integer.parseInt(balance);
		Employee employee=loginRepositoy.getOne(id);
		employee.setCurrentDrawerBalance(currBalance);
		loginRepositoy.saveAndFlush(employee);
				
		
	}
	@GetMapping("/cashBalance/employee/{empId}")
	public int getBalance(@PathVariable("empId") String empId) {
		long id=Long.parseLong(empId);
		Employee employee=loginRepositoy.getOne(id);
		return employee.getCurrentDrawerBalance();
	}

}
