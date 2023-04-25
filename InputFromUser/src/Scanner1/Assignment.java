package Scanner1;

import java.util.Scanner;
public class Assignment {
	
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
    public static void main(String[] args) {
    	
    	//((((x1+x2)+x3)-x4)*x5)/x6)
		Assignment s = new Assignment();
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value");
		int a1 = obj.nextInt();
		System.out.println("Enter the second value");
		int a2 = obj.nextInt();
		int a3 = s.sum(a1,a2);
		System.out.println("Ente the third Value");
		int a4= obj.nextInt();
		int a5 = s.sum(a4, a3);
		System.out.println("Enter the Fourth Value");
		int a6 = obj.nextInt();
		int a7 = s.Sub(a5, a6);
		System.out.println("Enter the Fifth Value");
	    int a8 = obj.nextInt();
	    int a9 = s.mul(a7, a8);
	    System.out.println("Enter the Sixth Value");
	    Float a10 = obj.nextFloat();
	    s.dev(a9, a10);
	    
		
		
	}
}
