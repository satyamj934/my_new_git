package com.inherit;

public class ClassB extends ClassA{
	void diplayB() {
		System.out.println("This is class B");
	}
	ClassB(){
		System.out.println("this is constructor B");
	}
	void displayProps() {
		System.out.println("Class B Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB b = new ClassB();
		b.displayA();
		b.diplayB();
		b.displayProps();
		float c = (float)55/12;
		System.out.println(c);
	}

}
