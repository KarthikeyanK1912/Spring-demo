package com.jspiders.Springcore_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.jspiders.Springcore_demo.dto.Student;

public class Run 
{
  public static void main(String[] args) 
  {
	ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans.xml");
	System.out.println("IOC container created..!!");
    System.out.println(context.getBean(Student.class));
	//context = new FileSystemXmlApplicationContext("xml-file");
	//context = new AnnotationConfigApplicationContext("java-file");
}
}
