package com.jspiders.annotation_based_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.annotation_based_config.config.JavaConfiguration;
import com.jspiders.annotation_based_config.dto.Employee;

public class App 
{
  public static void main(String[] args) 
  {
	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
	Employee bean1 = context.getBean(Employee.class);
	Employee bean2 = context.getBean(Employee.class);
	System.out.println();
	System.out.println(bean1.equals(bean2));
	System.out.println(bean1);
	System.out.println(bean2);
	
	

	
	//Employee bean = context.getBean("emp",Employee.class);
	//System.out.println(bean);
  }
}
