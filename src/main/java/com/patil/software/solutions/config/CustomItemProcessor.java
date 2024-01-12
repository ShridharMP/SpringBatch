package com.patil.software.solutions.config;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.patil.software.solutions.entity.Customer;

@Component
public class CustomItemProcessor implements ItemProcessor<Customer, Customer>{

	@Override
	public Customer process(Customer customer) throws Exception {
		return customer;
	}

}
