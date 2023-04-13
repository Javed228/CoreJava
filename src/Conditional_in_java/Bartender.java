package Conditional_in_java;

import java.util.Scanner;

// A bartender make a simple program to determine whether he should serve 
//the drink to custopmer.
//condition : He only serve to people age is 18 and older and when he not on  break

public class Bartender {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter (Yes) if he break or (No) if not on break :");
		String is_Break = sc.next();
		
		
		if(age >= 18 && is_Break == "no") {
			System.out.println("Serve");
		}
		else if(age < 18 && is_Break=="yes") {
			System.out.println("Not Serve");
		}
		else {
			System.out.println("Invalid");
		}
	}
}
