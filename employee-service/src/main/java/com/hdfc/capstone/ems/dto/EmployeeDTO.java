	package com.hdfc.capstone.ems.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 
 * @author Bharath Kumar
 *
 * @CreatedDate 21-Apr-2023
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeDTO {
	
	private long employeeId;
	private String employeeName;
	private LocalDate dateOfBirth;
	
	
}
