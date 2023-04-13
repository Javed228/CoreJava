package Conditional_in_java;

import java.util.Scanner;

//Take input from user 
//multiples of three output:"Fizz" instead of the number of number and
//for the multiples of five output:"Buzz"
//numbers which are multiples of both three and five output:"FizzBuzz"

public class FizzBuzz {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter Any Number : ");
		int num = sc.nextInt();
		
		if(num % 5==0 && num % 3==0) {
			System.out.println("FizzBuzz");
		}
		else if(num % 5==0) {
			System.out.println("Buzz");
		}
		else if(num % 3==0) {
			System.out.println("Fizz");
		}
		else {
			System.out.println(num);
		}
	}
}
