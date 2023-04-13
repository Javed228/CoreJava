package Conditional_in_java;

public class Typecasting {
	public static void main(String [] args) {
		//implicit (Widening typxasting small to big)
		int num = 9;
		double mydouble = num;
		System.out.println(mydouble);
		
		char a = 'a';
		int aAscii =  a;
		System.out.println("a ASCII Value"+" "+aAscii);
		
		char abc = (char)aAscii;
		System.out.println(abc);
		
		//Explicit (Narrowing type casting big to small)
		double per = 75.80d;
		int number = (int)per;
		System.out.println(number);
		
		
	}
}
