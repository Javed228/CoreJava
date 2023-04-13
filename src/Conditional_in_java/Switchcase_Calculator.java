package Conditional_in_java;

import java.util.Scanner;

//Calculator using SwitchCase

public class Switchcase_Calculator {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first Number :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the first Number :");
		int num2 = sc.nextInt();
		
		System.out.println("Enter Operation ( + , - , * , / , % ");
		String op = sc.next();
		char operation = op.charAt(0);  //type conversion
		
		switch(operation) {
		case '+' : System.out.println("Sum is : "+(num1+num2));
			break;
			
		case '-' : System.out.println("Subtrction is : "+(num1-num2));
			break;
			
		case '*' : System.out.println("Multi is : "+num1*num2);
			break;
			
		case '/' : System.out.println("Div is : "+num1/num2);
			break;
			
		case '%' : System.out.println("Mod is : "+num1%num2);
			break;
			
		default : System.out.println("enter valid data");
		}
	}
}
