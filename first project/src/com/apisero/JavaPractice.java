package com.apisero;

import java.util.*;

public class JavaPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method std
		// demostrate data types
		boolean b=true;
		byte by=12;
		short sh=24;
		int i=22;
		long l=422L;
		float f=2.12f;
		double d=42.11200d;
		char ch='s';
		
		System.out.println(b);
		System.out.println(by);
		System.out.println(sh);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		
		Apisero api = new Apisero("devops");
		api.changeDeptName("Mulesoft");
		System.out.println("No of employees in Apisero class - "+api.getNoOfEmployees());
		System.out.println("Department Name - "+api.getDeptName());
	}

}

class Apisero{
	private static int noOfEmployees = 1000;
	private String deptName;
	Apisero(String str){
		this.deptName=str;
	}
	public void changeDeptName(String string) {
		this.deptName=string;
	}
	public int getNoOfEmployees() {
		return this.noOfEmployees;
	
	}
	public String getDeptName() {
		return this.deptName;
	}
	
}


