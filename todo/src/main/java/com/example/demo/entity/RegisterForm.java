package com.example.demo.entity;

import java.util.Date;

import lombok.Data;

@Data
public class RegisterForm {
	
	private Integer id;
//

	
	private String taskNote;
	
	private Integer projectId;
	
	private Date intTimeStmp;
	
	private Date updTimeStmp;
	
	

}
