package Swapnumbers;

public class swap {
	
	public void swap()
	{

	int a=10;
	System.out.println("initial value of a is 10");
	int b=20;
	System.out.println("Initial value of b is 20");
	int c;
	
	c = b - a;
	b = c;
	System.out.println("Print Value of B " + b);
	
	c = b+a;
	a=c;
	System.out.println("print Value of A " + a);
	}
	
	public static void main(String[] args) {
		
		swap p = new swap();
		p.swap();
	}
	
}
