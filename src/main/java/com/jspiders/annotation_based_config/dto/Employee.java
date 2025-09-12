package com.jspiders.annotation_based_config.dto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Component("emp")
//@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Employee 
{
	@Value("${employeeId}")
  private int employeeId;
	@Value("${name}")
  private String name;
	@Value("${email}")
  private String email;
	@Value("${contact}")
  private String contact;
	
	@Autowired
	private EmployeeIdCard card;
}



/*
 * 
 * Annotation based configuration is alternative of bean defination (bean tag),@Component
 * Annotation will be used for creating the beans,
 * @Value Annotation is used for initialization of bean's properties,
 * this annotation makes feild as final
 * @Autowired  
 * 
 */
