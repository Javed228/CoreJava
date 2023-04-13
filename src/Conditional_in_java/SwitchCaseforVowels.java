package Conditional_in_java;


import java.util.Scanner;

//Check Character is Vowel or Not

public class SwitchCaseforVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Alphabet :");
		String v = sc.next();
		char vowel = v.charAt(0);
		
		switch(vowel) {
			case 'a' : System.out.println("This is Vowel");
				break;
			case 'e' : System.out.println("This is Vowel");
				break;
			case 'i' : System.out.println("This is Vowel");
				break;
			case 'o' : System.out.println("This is Vowel");
				break;
			case 'u' : System.out.println("This is Vowel");
				break;
			default : System.out.println("This is not Vowel");
			
		}
		
	}
}
