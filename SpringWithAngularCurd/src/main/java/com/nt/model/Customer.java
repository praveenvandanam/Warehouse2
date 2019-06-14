package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
    @Entity
	@Table(name = "customer2")
    @Data
    public class Customer {
	 @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	 
	  @Column(name = "name")
	  private String name;
	 
	  @Column(name = "age")
	  private int age;
	 
//	  @Column(name = "active")
//	  private boolean active;
	 
	  public Customer() {
	  }
	 
	  public Customer(String name, int age) {
	    this.name = name;
	    this.age = age;
	  ///  this.active = false;
	  }}