package Conditional_in_java;

import java.util.Scanner;

// Check time and say Good Morning And Good Afternoon etc.. according to time
public class Good_Morning {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Time");
		int time = sc.nextInt();
		
		if(time >= 6 && time < 12) {
			System.out.println("Good Morning");
		}
		else if(time >= 12 && time < 18) {
			System.out.println("Good Afternoon");
		}
		else if(time >= 18 && time < 22) {
			System.out.println("Good Evening");
		}
		else {
			System.out.println("Good Night");
		}
		
	}
}
