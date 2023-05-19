package Factorial;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Factorial {
	
	//n=n* (n-1)
	public static void main(String[] args) {
			
	Factorial f = new Factorial();
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Your Value");
	int n = s.nextInt();
	int fact = 1;
	int i;
	for(i=1;i<=n;i++)
	{
		fact= fact * i;
		
	}
	System.out.println("Factorial of Given Number is "+ fact);
	}
}

