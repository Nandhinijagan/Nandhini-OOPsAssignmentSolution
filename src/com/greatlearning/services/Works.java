package com.greatlearning.services;

import java.util.Scanner;

import com.greatlearning.models.AdminDepartment;
import com.greatlearning.models.HrDepartment;
import com.greatlearning.models.TechDepartment;

public class Works {
	
	public void greetings() {
		System.out.println("Welcome to the Corporate World!!!!!!");	
		System.out.println("===================================================");
		System.out.println(
				"Enter your choice from below list.\n" 
						+ "1. Get all departemnts info.\n"
						+ "2. Get individual departemnts info\n"
						+ "--> Enter 0 to Exit.\n");
		System.out.println("___________Enter your choice below:___________");
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String salutation(String department) {
		return "Welcome to "+department;
	}
	
	public void  getAdminDepartmentDetails(AdminDepartment admin) {
		System.out.println(salutation(admin.departmentName()));
		System.out.println(admin.getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println();
	}

	public void getHrDepartmentDetails(HrDepartment hr) {
		// TODO Auto-generated method stub
		System.out.println(salutation(hr.departmentName()));
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();
		
	}

	public void getTechDepartmentDetails(TechDepartment tech) {
		// TODO Auto-generated method stub
		System.out.println(salutation(tech.departmentName()));
		System.out.println(tech.getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
		System.out.println();
		
	}

	public void getDepartmentDetails(int department, AdminDepartment admin, HrDepartment hr, TechDepartment tech) {
		switch(department) {
		case 0:
			System.out.println("----------------------Thank You---------------------------");
			break;
		case 1:
			getAdminDepartmentDetails(admin);
			break;
		case 2:
			getHrDepartmentDetails(hr);
			break;
		case 3:
			getTechDepartmentDetails(tech);
			break;
		default:
			System.out.println("Please enter an number given in the list.");
			break;
		}
	}
	
	
	public void getDepartments(int info, Scanner sc, AdminDepartment admin, HrDepartment hr, TechDepartment tech) {
		int department = 0;
		switch(info) {
		case 0:
			System.out.println("----------------------Thank You---------------------------");
			break;
		case 1:
			getAdminDepartmentDetails(admin);
			getHrDepartmentDetails(hr);
			getTechDepartmentDetails(tech);
			break;
		case 2:
			System.out.println("===================================================");
			System.out.println(
				"Enter your choice from below list.\n"
					+ "1.Admin Department\n"
					+ "2.HR Department\n"
					+ "3.Tech Department\n"
					+ "--> Enter 0 to Exit.\n");
			System.out.println("___________Enter your choice below:___________");
			do {
				try {
					department = sc.nextInt();
				}catch(Exception e)  {  
					System.out.println("Please enter an number given in the list."); 
					sc.next();
					department = sc.nextInt();
					return;
			    } 
				getDepartmentDetails(department, admin, hr, tech);
			}while(department !=0);
			break;
		default:
			System.out.println("Please enter an number given in the list.");
			break;
		}
	}
	
}
