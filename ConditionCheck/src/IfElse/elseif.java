package IfElse;
import java.util.Scanner;

public class elseif {
	
	public static void main(String[] args) {
		

	Scanner s = new Scanner(System.in);
	System.out.println("Enter Your Marks");
	int mark = s.nextInt();
	if((mark>=0)&&(mark<=35))
	{
		System.out.println("You Are Fail");
	}
	else if((mark>=36)&&(mark<=60))
	{
		System.out.println("You are Pass");
	}
	else if ((mark>=61)&&(mark<=85))
	{
		System.out.println("You Got First Devision");
	}
	else if ((mark>=86)&&(mark<=100))
	{
		System.out.println("You Are the Topper of the class");
	}
	else 
		System.out.println("Enter Correct Marks");
	}

}
