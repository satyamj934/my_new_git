package com.apisero;
import java.util.*;
public class JavaPractice2 {
	// find thr reverse of a number
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int m = n;
		int x=0;
		while(n>0) {
			x=x*10+n%10;
			n=n/10;
		}
		System.out.println("reverse of the number = "+x);
		
		//check if it is palindrome or not
		if(x==m)
			System.out.println("It is Palindrome");
		else
			System.out.println("not a palindrome");
		System.out.println("select a choice for bitwise operation\n1-And\n2-Or\n3-Xor\n4-Compliment");
		int ch = sc.nextInt();
		switch(ch) {
		case 1 :System.out.println("bitwise and is " +(m&x));
		break;
		case 2 :System.out.println("bitwise or is "+(m|x));
		break;
		case 3 :System.out.println("bitwise xor is "+(m^x));
		break;
		case 4 :System.out.println("bitwise compliment is "+~x);
		break;
		default:System.out.println("enter a valid choice");
		break;
		}
		
		sc.close();
	}

}
