package Assignment;

public class Assignment2 {
	
	 public int dev(int x1, int y1)
   {
	   int z1;
	   z1=x1/y1;
	   System.out.println("The Dev is " + z1);
	   return z1;
	      }
   public int sub(int x, int y)
   {
	   int z;
	   z=x-y;
	   System.out.println("the Sub is " + z);
	   return z;
   }
   public int sum(int a, int b)
	{
		int c = a+b;
		System.out.println("The Sum is " + c);
		return c;
		
	}
  public void mul(int a1, int b1)
{
	int c1;
	c1=a1*b1;
	System.out.println("The Multi is " + c1);

}
	public static void main (String[] args)
	{
		//((((10/2)-2)-2)+2)*2)
		Assignment2 a = new Assignment2();
		int devresult = a.dev(10, 2);
		int subresult = a.sub(devresult, 2);
		int subresult2 = a.sub(subresult, 2);
		int sumresult = a.sum(subresult2, 2);
		a.mul(sumresult, 2);
	}
}
