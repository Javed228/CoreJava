package Conditional_in_java;

import java.util.Scanner;

public class Grade {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your percentage");
		float percentage = sc.nextFloat();
		
		if(percentage >= 75 && percentage <=100) {
			System.out.println("You got Distinct class");
		}
		else if(percentage >=60 && percentage < 75) {
			System.out.println("You got First class");
		}
		else if(percentage >= 50 && percentage <60) {
			System.out.println("You got Second class");
		}
		else if(percentage > 35 && percentage < 50) {
			System.out.println("You got Third class");
		}
		else if(percentage < 35) {
			System.out.println("Fail");
		}
		
		else {
			System.out.println("Enter Valid Percentage");
		}
	}
}
