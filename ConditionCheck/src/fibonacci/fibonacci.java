package fibonacci;
import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		
		fibonacci f = new fibonacci();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value");
		int n=7;
		int j=1;
		int s1 =1;
		int t;
	   System.out.println(j);
	   System.out.println(s1);
	   for(int i = 3;i<=n;i++)
	   {
		  
		  t=j+s1;
		  System.out.println(t);
		  j=s1;
		 s1=t;	
		  
	   }
	   
		
	
	}
}
