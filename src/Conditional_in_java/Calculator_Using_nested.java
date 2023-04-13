package Conditional_in_java;

import java.util.Scanner;

public class Calculator_Using_nested {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first Number :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the first Number :");
		int num2 = sc.nextInt();
		
		System.out.println("Enter Operation ( + , - , * , / , % ");
		String op = sc.next();
		char operation = op.charAt(0);  //type conversion
		
		if(operation == '+') {
			System.out.println("Sum is : "+(num1+num2));
		}
		else {
			if(operation == '-') {
				System.out.println("Subtraction is : "+(num1-num2));
			}
			else {
				if(operation == '*') {
					System.out.println("Multiplication is : "+num1*num2);
				}
				else {
					if(operation == '/') {
						System.out.println("Division is : "+num1/num2);
					}
					else {
						if(operation == '%') {
							System.out.println("Mod is : "+num1%num2);
						}
					}
				}
			}
		}
	}
}
