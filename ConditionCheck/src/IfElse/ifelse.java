package IfElse;

import java.util.Scanner;

public class ifelse {
	
    public static void main(String[] args) {
		
    	ifelse e = new ifelse();
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter your Marks");
    	int marks = s.nextInt();
    	if(marks>=35)
    	{
    		System.out.println("Your Are Pass");
    	}
    	else
    	{
    		System.out.println("You Are fail");
    	}
    	
	}

}
