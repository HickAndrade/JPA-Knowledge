package br.com.fiap.dao;

import br.com.fiap.entity.Customer;


// uma interface pode herdar mais de uma interface 

public interface CustomerDAO extends GenericDAO<Customer, Integer> {
	
	 
}
