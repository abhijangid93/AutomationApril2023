package Assignment1;

public class Assignment {
	
	//((((10+2)+2)-2)*2)/2)
	
	public int sum(int a, int b)
	{
		int c = a+b;
		System.out.println("The Sum is " + c);
		return c;
		
	}
   public int sub(int x, int y)
   {
	   int z;
	   z=x-y;
	   System.out.println("the Sub is " + z);
	   return z;
   }
   public void dev(int x1, int y1)
   {
	   int z1;
	   z1=x1/y1;
	   System.out.println("The Dev is " + z1);
	   
   }
  public int mul(int a1, int b1)
{
	int c1;
	c1=a1*b1;
	System.out.println("The Multi is " + c1);
	return c1;
}
  
  public static void main (String[] args)
  {
	//((((10+2)+2)-2)*2)/2)
	  Assignment A = new Assignment();
	  int SumResult=A.sum(10, 2);
	  int SumResult2= A.sum(SumResult, 2);
	  int subresult = A.sub(SumResult2, 2);
	  int mulresult = A.mul(subresult, 2);
	  A.dev(mulresult, 2);
	  
  }
}
