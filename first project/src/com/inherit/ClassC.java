package com.inherit;

public class ClassC extends ClassB{
void displayC() {
		System.out.println("this is class C");
	}
	ClassC(){
		System.out.println("This is COnstructor C");
	}
	void displayProps() {
		System.out.println("Class C Method");
		super.main(null);
	}
	public static void main(String[] args) {
		ClassC c = new ClassC();
		c.displayA();
		c.diplayB();
		c.displayC();
		c.displayProps();
		
	}

}
