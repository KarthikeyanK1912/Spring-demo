package com.jspiders.Springcore_demo.dto;

import java.util.List;

import lombok.Data;

@Data
public class Hospital 
{
  private int hospitalId;
  private String hospitalName;
  private String address;
  private String contact;
  
  private List<Doctor> doctors;
}
