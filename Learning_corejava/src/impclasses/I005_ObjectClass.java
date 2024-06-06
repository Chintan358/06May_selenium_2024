package impclasses;


class A
{
	public void display()
	{
		
	}
	
	@Override
	public String toString() {
		
		return "Hello";
	}
}

class B extends A
{
	
}

public class I005_ObjectClass {
	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a);
		
	}
}
