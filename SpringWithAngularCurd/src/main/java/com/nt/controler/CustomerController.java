package com.nt.controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Customer;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {
 @Autowired
private CrudRepository repository;
 @GetMapping("/customers")
public List<Customer>getTheData(){
	 List<Customer> customers=new ArrayList<>();
	 System.out.println("no values..1");
	 customers= (List<Customer>) repository.findAll();
	 System.out.println(customers);
	 System.out.println("..........");
	return customers; //--> get the for customers 
	 
	 
	 
 }
}
