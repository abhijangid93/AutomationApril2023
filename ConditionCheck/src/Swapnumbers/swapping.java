package Swapnumbers;

public class swapping {
	
	public void swap()
	{
	
		int x=10;
		System.out.println("initial value of x is before swapping 10");
		int y=20;
		System.out.println("Initial value of y is before swapping 20");
		
		x = x+y;
		y = x-y;
		System.out.println("print value of Y is after swapping " + y);
		x = x-y;
		System.out.println("Print Value of X is is after swapping " + x);
			}
	public static void main(String[] args) {
		swapping s = new swapping();
		s.swap();
	}
	


}
