package dbugging;

public class dbugging {
	
	public void m1()
	{
		System.out.println("First Line print");
		System.out.println("Second Line Print");
	}
	public void m2()
	{
		System.out.println("Third Line Print");
		System.out.println("Forth Line Print");
		
	}
	public static void main(String[] args) {
		System.out.println("Fifth Line print");
		System.out.println("Sixeth Line print");
		dbugging d = new dbugging();
		d.m2();
		System.out.println("SeventhLine print");
		d.m1();
		
	}

}
