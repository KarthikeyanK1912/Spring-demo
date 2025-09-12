package com.jspiders.annotation_based_config.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class EmployeeIdCard 
{
	@Value("${serialId}")
	private int serialId;
	private String name;
	private String employeeId;
	private String department;
	

}
