package Overriding;

public class parent {

	public int multi(int a, int b)
	{
		int c = a*b;
		System.out.println("The Value of Multi is " + c);
		return c;
	}
	public int dev(int a, int b)
	{
		int c = a/b;
		System.out.println("The Value of Multi is " + c);
		return c;
	}

}
