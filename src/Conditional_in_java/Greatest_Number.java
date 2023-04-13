package Conditional_in_java;

import java.util.Scanner;

//Checking Greatest number between three numbers

public class Greatest_Number {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first Number :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second Number :");
		int num2 = sc.nextInt();
		
		System.out.println("Enter the third Number :");
		int num3 = sc.nextInt();
		
		//Checking Greatest number between three numbers
		if(num1 > num2 && num1 >num3) {
			System.out.println("Num1 is Greatest");
		}
		else if(num2 > num1 && num2 > num3) {
			System.out.println("Num2 is Greatest");
		}
		else {
			System.out.println("Num3 is Greatest");
		}
		
	}
}
