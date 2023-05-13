package Table;

import java.util.Scanner;

public class Table {
	
	public static void main(String[] args) {
		
		Table t = new Table();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		for(int i=1;i<=10;i++)
		{
			
			System.out.println(n+ " * " +i+ " = " +n*i);
			
			
		}
		
	}

}
