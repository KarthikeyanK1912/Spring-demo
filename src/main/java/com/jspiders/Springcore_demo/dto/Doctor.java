package com.jspiders.Springcore_demo.dto;

import java.util.List;

import lombok.Data;

@Data
public class Doctor 
{ 
	private int doctorId;
	private String doctorName;
	private String email;
	private String contact;
	
	private List<String> qualifications;

}
