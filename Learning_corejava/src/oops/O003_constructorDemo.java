package oops;

class Emp
{
	int id;
	String name;
	
	Emp(int id, String name)
	{
		this.id   = id;
		this.name = name;
	}
	
	public void print()
	{
		System.out.println(id+" "+name);
	}
}

public class O003_constructorDemo {
	public static void main(String[] args) {
		
		Emp e = new Emp(10,"Nitesh");
		e.print();
	
		Emp e1 = new Emp(20, "Shivam");
		e1.print();
		
		Emp e3 = new Emp(30, "Test");
		e3.print();
	}
}
