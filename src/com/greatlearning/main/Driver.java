package com.greatlearning.main;

import java.util.Scanner;
import com.greatlearning.models.AdminDepartment;
import com.greatlearning.models.HrDepartment;
import com.greatlearning.models.TechDepartment;
import com.greatlearning.services.Works;

public class Driver {
	public static void main(String[] args) {
		int info = 0;
		Scanner sc = new Scanner(System.in);
		AdminDepartment admin = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
		Works work = new Works();
		work.greetings();
		do{
			try {
				info = sc.nextInt();
			}catch(Exception e)  {  
				System.out.println("Please enter an number given in the list."); 
				sc.next();
				info = sc.nextInt();
			} 
		System.out.println();
		work.getDepartments(info, sc, admin, hr, tech);
		}while(info != 0);
		sc.close();
	}
}
