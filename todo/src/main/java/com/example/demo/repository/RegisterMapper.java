package com.example.demo.repository;

import com.example.demo.entity.RegisterForm;

public interface RegisterMapper {
	public RegisterForm selectAll();
	
	public RegisterForm selectId();
	
	
	public void update();
	
	public void delete();
	
}
