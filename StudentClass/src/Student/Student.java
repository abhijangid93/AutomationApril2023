package Student;

public class Student {
	
	int rollno;
	int age;
	public void method()
	{
		System.out.println("Welcome you all");
		System.out.println("Automation is very easy");
	}
	
	public static void main (String[] args)
	
	{
		Student s=new Student();
		s.age = 25;
		System.out.println(s.age);
		s.rollno = 158;
		System.out.println(s.rollno);
		s.method();
		
		
	}

}
