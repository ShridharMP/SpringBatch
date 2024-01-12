package com.patil.software.solutions.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="CUSTOMER_INFO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private long contactNo;
	private String country;
	private Date dob;
}
