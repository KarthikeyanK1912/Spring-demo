package com.jspiders.Springcore_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.jspiders.Springcore_demo.dto.Car;
import com.jspiders.Springcore_demo.dto.Doctor;
import com.jspiders.Springcore_demo.dto.Student;

public class Run 
{
  public static void main(String[] args) 
  {
	ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans.xml");
	System.out.println("IOC container created..!!");
    // System.out.println(context.getBean("student1",Student.class));
    //System.out.println(context.getBean("student2",Student.class));
	//System.out.println(context.getBean("Car1",Car.class));
	  //System.out.println(context.getBean("Car2",Car.class));

	System.out.println(context.getBean("Doctor1",Doctor.class));
	
	
	
	  
	//  System.out.println(bean);
    
	//context = new FileSystemXmlApplicationContext("xml-file");
	//context = new AnnotationConfigApplicationContext("java-file");
}
}
