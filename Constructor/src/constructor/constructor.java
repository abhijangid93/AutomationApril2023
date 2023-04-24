package constructor;

public class constructor {
	
	public constructor ()
	{
		this(1,2,3);
		System.out.println("Default Constructor");
	}
	public constructor (int a)
	{
		this();
		System.out.println("One Parameterized Constructor");
	}
	public constructor (int a,int b)
	{
		this(1);
		System.out.println("Two Parameterized Constructor");
	}
	public constructor (int a, int b, int c)
	{
		System.out.println("Three Parameterized Constructor");
	}
	public constructor (int a, int b, int c,int d)
	{
		this(1,2);
		System.out.println("Four Parameterized Constructor");
	}

	public static void main (String[] args)
	{

/*three parameterized constructor
default constructor
one parameterized consturctor
two parameterized constructor
four parameterized consturcott*/
   constructor c = new constructor(1,2,3,4);
	}
}
