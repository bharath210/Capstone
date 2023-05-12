package com.hdfc.capstone.ems.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * 
 * @author Bharath Kumar
 *
 * @CreatedDate 21-Apr-2023
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "Employee")
public class Employee {
	
	@Id
	private long employeeId;
	private String employeeName;
	private LocalDate dateOfBirth;
	
}
