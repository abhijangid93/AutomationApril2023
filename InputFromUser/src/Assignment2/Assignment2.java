package Assignment2;

import java.util.Scanner;

public class Assignment2 {
	
	public int sum (int a, int b)
	{
		int c = a+b;
		System.out.println("The value of Sum is " + c);
		return c;
	}
	public int Sub (int a, int b)
	{
		int c = a-b;
		System.out.println("The value of Sub is " + c);
		return c;
	}
	public int mul (int a, int b)
	{
		int c = a*b;
		System.out.println("The value of Multi is " + c);
		return c;
	}
    public void dev(float a, float b)
    {
    	float
    	c= a/b;
    	System.out.println("The value of Dev is " + c);
    }
    
    public static void main(String[] args)
    {
    	//(((((x1*x2)-x3)+x4)-x5)/x6)
		Assignment2 a = new Assignment2();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value For Mul");
		int a1 = s.nextInt();
		System.out.println("Enter 2nd value for Mul");
		int a2 = s.nextInt();
	    int a3 = a.mul(a1, a2);
	    System.out.println("Enter value for Sub");
		int a4 = s.nextInt();
        int a5 = a.Sub(a3,a4);
        System.out.println("Enter Value for Sum");
        int a6 = s.nextInt();
        int a7 = a.sum(a6, a5);
        System.out.println("Enter Value for Sub");
        int a8 = s.nextInt();
        int a9 = a.Sub(a7, a8);
        System.out.println("Enter Value for Dev");
        float a10 = s.nextFloat();
        a.dev(a9, a10);
	}

}
