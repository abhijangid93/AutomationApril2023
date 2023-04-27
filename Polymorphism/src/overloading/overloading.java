package overloading;

import java.util.Scanner;

public class overloading {
	
	public int Addition(int a, int b)
	{
		int c= a + b;
		System.out.println("The Value of Sum is " + c);
		return c;
	} 
	public void Addition(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println("The Value of Addition is " + d);
		
		
	}
	public static void main(String[] args) {
		
		overloading o = new overloading();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Value");
		int sumresult = s.nextInt();
		System.out.println("Enter Your Value");
		int sumresult2 = s.nextInt();
		int finalr = o.Addition(sumresult, sumresult2);
		System.out.println("Enter you value");
		int add = s.nextInt();
		System.out.println("Enter you value");
		int add2 = s.nextInt();
		o.Addition(finalr, add, add2);
		
		
	}
}
