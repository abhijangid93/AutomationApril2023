package TP1;

public class TP2 {

	public static void main(String[] args) {
		
		int i,j,k;
		for(i=1;i<=10;i++)
		{
			for(j=0;j<10-i;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k<i*2-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
