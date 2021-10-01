package com.example.day02.employee;

import lombok.Data;

public @Data class EmployeeResponse{
	private String name;
	private int id;

	public EmployeeResponse(int id, String name) {
		this.id = id;
		this.name = name;
	}
}