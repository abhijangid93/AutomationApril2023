package Prime;
import java.util.Scanner;

public class prime {
	
	public static void main(String[] args) 
	{
		prime p = new prime();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number ");
		int prime = s.nextInt();
		int count = 0;
		for (int i=1;i<=prime;i++)
		{
			if(prime%i==0)
			
			count++;
		}
		
			
			if(count==2)
		
				System.out.println("The Number is Prime");
		
			else 
			
				System.out.println("Not Prime Number");
			
			
		
		
	}

}
