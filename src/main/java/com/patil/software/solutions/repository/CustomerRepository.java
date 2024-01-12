package com.patil.software.solutions.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patil.software.solutions.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
