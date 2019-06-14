package com.nt.repositary;

import org.springframework.data.repository.CrudRepository;

import com.nt.model.Customer;

 interface CustomerRepository  extends CrudRepository<Customer,Long>
{

}
