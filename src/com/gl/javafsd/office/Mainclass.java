package com.gl.javafsd.office;

import com.gl.javafsd.office.Departments.AdminDepartment;
import com.gl.javafsd.office.Departments.HrDepartment;
import com.gl.javafsd.office.Departments.TechDepartment;

public class Mainclass {
	
	public static void main(String[] args)
	{
		Departments x = new Departments();
		AdminDepartment ad = x.new AdminDepartment();
		System.out.println("Welcome to "+ad.getDepartmentName());
		System.out.println(ad.getGetTodaysWork());
		System.out.println(ad.getGetWorkDeadline());
		System.out.println(ad.getIsTodayAHoliday());
		System.out.println();
		HrDepartment hd = x.new HrDepartment();
		System.out.println("Welcome to "+hd.getDepartmentName());
		System.out.println(hd.getDoActivity());
		System.out.println(hd.getGetTodaysWork());
		System.out.println(hd.getGetWorkDeadline());
		System.out.println(hd.getIsTodayAHoliday());
		System.out.println();
		TechDepartment td = x.new TechDepartment();
		System.out.println("Welcome to "+td.getDepartmentName());
		System.out.println(td.getGetTodaysWork());
		System.out.println(td.getGetWorkDeadline());
		System.out.println(td.getGetTechStackInformation());
		System.out.println(td.getIsTodayAHoliday());
	}
}
