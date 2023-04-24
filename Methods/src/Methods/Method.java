package Methods;

public class Method {
	
	public void a()
	{
		this.a2(1, 2, 3);
		System.out.println("Default Method");
		this.a4(1);
		this.a1(1, 2);
		this.a3(1, 2, 3, 4);
		
	}
	public void a4(int a)
	{
		System.out.println("One Parameterized Method");
	}
	public void a1(int a, int b)
	{
		System.out.println("Two Parameterized Method");
	}
	public void a2(int a, int b, int c)
	{
		System.out.println("Three Parameterized Method");
	}
	public void a3(int a, int b, int c,int d)
	{
		System.out.println("Four Parameterized Method");
	}
	
	public static void main (String[] args)
	{
		/*three parameterized method
		default method
		one parameterized method
		two parameterized method
		four parameterized method*/
		
		Method m = new Method();
		m.a();
	}
	

}
