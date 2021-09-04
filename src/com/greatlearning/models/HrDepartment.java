package com.greatlearning.models;

public class HrDepartment extends SuperDepartment{

	public String departmentName()  {
		return "HR Department ";
	}

	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}
 
	public String doActivity() {
		return "team Lunch";
	}
	
}
