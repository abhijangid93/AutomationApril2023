package inheritance;
public class Parent {
	
	public Parent ()
	{
		this(1,2,3);
		System.out.println("parent default Constructor");
	}
	public Parent (int a)
	{
		this(1,2);
		System.out.println("parent One Parameterized Constructor");
	}
	public Parent (int a,int b)
	{
		this(1,2,3,4);
		System.out.println("parent Two Parameterized Constructor");
	}
	public Parent (int a,int b, int c)
	{
		System.out.println("parent Three Parameterized Constructor");
	}
	public Parent (int a,int b, int c, int d)
	{
		this();
		System.out.println("parent Four Parameterized Constructor");
	}
}
