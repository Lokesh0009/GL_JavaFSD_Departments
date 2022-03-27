package com.gl.javafsd.office;

public class Departments
{
	public class SuperDepartment
	{
		public String departmentName = "Super Department";
		public String getTodaysWork = "No Work as of now";
		public String getWorkDeadline = "Nil";
		public String isTodayAHoliday = "Today is not a Holiday";
		
		public String getDepartmentName() {
			return this.departmentName;
		}
		
		public String getGetTodaysWork() {
			return getTodaysWork;
		}
		
		public String getGetWorkDeadline() {
			return getWorkDeadline;
		}

		public String getIsTodayAHoliday() {
			return isTodayAHoliday;
		}
				
	}
	
	public class AdminDepartment extends SuperDepartment
	{
		public String departmentName = "Admin Department";
		public String getTodaysWork = "Complete your documents Submission";
		public String getWorkDeadline = "Complete by EOD";
		
		public String getDepartmentName() {
			return departmentName;
		}
		
		public String getGetTodaysWork() {
			return getTodaysWork;
		}
		
		public String getGetWorkDeadline() {
			return getWorkDeadline;
		}

		public String getIsTodayAHoliday() {
			return isTodayAHoliday;
		}
	}
	
	public class HrDepartment extends SuperDepartment
	{
		public String departmentName = "HR Department";
		public String getTodaysWork = "Fill today’s timesheet and mark your attendance";
		public String getWorkDeadline = "Complete by EOD";
		public String doActivity = "team Lunch";
		
		public String getDepartmentName() {
			return departmentName;
		}
		
		public String getGetTodaysWork() {
			return getTodaysWork;
		}
		
		public String getGetWorkDeadline() {
			return getWorkDeadline;
		}
		
		public String getDoActivity() {
			return doActivity;
		}


		public String getIsTodayAHoliday() {
			return isTodayAHoliday;
		}
	}
	
	public class TechDepartment extends SuperDepartment
	{
		public String departmentName = "Tech Department";
		public String getTodaysWork = "Complete coding of Module 1";
		public String getWorkDeadline = "Complete by EOD";
		public String getTechStackInformation = "Core Java";
		
		public String getDepartmentName() {
			return departmentName;
		}
		
		public String getGetTodaysWork() {
			return getTodaysWork;
		}
		
		public String getGetWorkDeadline() {
			return getWorkDeadline;
		}
		
		public String getGetTechStackInformation() {
			return getTechStackInformation;
		}
		
		public String getIsTodayAHoliday() {
			return isTodayAHoliday;
		}
	}
	
}
	

