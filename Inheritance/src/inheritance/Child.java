package inheritance;
/*child 2 parmaeterized 
child default cosntructor
child 3 parameterized consturctor
child 4 parmaeterized cosnturctor
child 1 parameterized consturctor
*/

public class Child extends Parent {

	public Child()
	{
		this(1,2);
		System.out.println("Child Default Constructor");
	}
	public Child(int a)
	{
		this(1,2,3,4);
		System.out.println("Child One Parameterized Constructor");
	}
	public Child(int a,int b)
	{
		super(1);
		System.out.println("Child Two Parameterized Constructor");
	}
	public Child(int a,int b,int c)
	{
		this();
		System.out.println("Child Three Parameterized Constructor");
	}
	public Child(int a,int b,int c, int d)
	{
		this(1,2,3);
		System.out.println("Child Four Parameterized Constructor");
	}
	public static void main(String[] args) {
		Child c = new Child(1);
		
	}
}
