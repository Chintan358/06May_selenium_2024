package oops;

class Student
{
	Student()
	{
		System.out.println("constructor calling..");
	}
	
	Student(String name)
	{
		System.out.println("My name is : "+name);
	}
	
	Student(int id)
	{
		System.out.println("My id is : "+id);
	}
	
	public void display()
	{
		System.out.println("running display");
	}
}

public class O002_constructor {
	public static void main(String[] args) {
		
		Student st = new Student();
		//st.display();
		
		Student st1 = new Student(10);
		
		Student st2 = new Student("Nitesh");
	}
}