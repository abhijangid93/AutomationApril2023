package Palindrom;
import java.util.Scanner;
public class Palindrom 
{
	
	public static void main(String[] args) {
		
		Palindrom p = new Palindrom();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter A Value");
		int n = s.nextInt();
		int temp = n;
		int rev = 0,rem;
		
		while(temp!=0)
		{
			rem=temp%10;
			rev = rev*10+rem;
			temp=temp/10;
		}
		if (n==rev)
		{
			System.out.println(n +  " is a palindrom number");
			
		}
		else 
		{
			System.out.println(n +  " is not a palindrom number");
		}
	}
	


}
