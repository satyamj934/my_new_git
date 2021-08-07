package com.inherit;

public class ClassD extends ClassABS implements ClassI{
	public void multiply(int a,int b) {
		System.out.println( a*b);
	}
	public void add(int a,int b) {
		System.out.println( a*b);
	}
	public void subtract(int a,int b) {
		System.out.println( a*b);
	}
	public void display() {
		System.out.println("This is abstract Method of Class I");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassD d = new ClassD();
		d.add(5, 8);
		d.subtract(88, 45);
		d.multiply(85, 4);
		d.display();
		
	}

}
