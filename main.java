package com.assignment.main;
import java.util.*;
import java.lang.*;
import java.io.*;

class SuperDepartment
{
	public String departmentName()
    {
        return "Super Department";
    }
	public String getTodaysWork()
    {
        return "No Work as of now";
    }
    public String getWorkDeadline()
    {
        return "Nil";
    }
    public String isTodayAHoliday()
    {
        return "Today is not a holiday";
    }
}

class AdminDepartment extends SuperDepartment
{
	public String departmentName()
    {
        return "Admin Department";
    }
	public String getTodaysWork()
    {
        return "Complete your documents Submission";
    }
    public String getWorkDeadline()
    {
        return "Complete by EOD";
    }
}

class HrDepartment extends SuperDepartment
{
	public String departmentName()
    {
        return "Hr Department";
    }
	public String getTodaysWork()
    {
        return "Fill today’s timesheet and mark your attendance";
    }
    public String getWorkDeadline()
    {
        return "Complete by EOD";
    }
    public String doActivity()
    {
        return "team Lunch";
    }
}

class TechDepartment extends SuperDepartment
{
	public String departmentName()
    {
        return "Tech Department";
    }
	public String getTodaysWork()
    {
        return "Complete coding of module 1";
    }
    public String getWorkDeadline()
    {
        return "Complete by EOD";
    }
    public String getTechStackInformation()
    {
        return "core Java";
    }
}

public class main {
    public static void main(String args[])
    {
		AdminDepartment adminDepartment = new AdminDepartment();
		HrDepartment hrDepartment = new HrDepartment();
		TechDepartment techDepartment = new TechDepartment();
		
		System.out.println("Welcome to "+ adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayAHoliday()+"\n");
		
		System.out.println("Welcome to "+ hrDepartment.departmentName());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(hrDepartment.isTodayAHoliday()+"\n");
		
		System.out.println("Welcome to "+ techDepartment.departmentName());
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.getTechStackInformation());
		System.out.println(techDepartment.isTodayAHoliday());
		
    }
}