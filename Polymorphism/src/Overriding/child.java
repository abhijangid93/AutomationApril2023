package Overriding;
import java.util.Scanner;

public class child extends parent {
	

	public int multi(int a, int b)
	{
		int c = a*b;
		System.out.println("The Value of Multi is " + c);
		return c;
	}
	public int dev(int a, int b)
	{
		int c = a-b;
		System.out.println("The Value of Multi is " + c);
		return c;

	}
	public static void main(String[] args) {
		child c = new child();
		parent p = new parent();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your 1st value");
		int x = s.nextInt();
		System.out.println("Enter Your 2nd Value");
		int y = s.nextInt();
		int z = p.dev(x, y);
		
	}
	
	
}
