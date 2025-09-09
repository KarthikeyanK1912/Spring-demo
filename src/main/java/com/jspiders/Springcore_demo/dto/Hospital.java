package com.jspiders.Springcore_demo.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hospital 
{
  private int hospitalId;
  private String hospitalName;
  private String address;
  private String contact;
  
  private List<Doctor> doctors;

   public Hospital(List<Doctor> doctors) 
   {
	super();
	this.doctors = doctors;
   }
  
  
}
