package Armstrong;
import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		
		Armstrong a = new Armstrong();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The value");
		int n = s.nextInt();
		int temp=n;
		int r, sum =0;
		
		while (n>0)
		{
			r = n%10;
			n = n/10;
			sum = sum + r*r*r;
		}
		if (temp == sum)
		{
			System.out.println("This is the Armstrong Number");
		}
		else
		{
			System.out.println("Not An Armstrong Number");
		}
	}

}
