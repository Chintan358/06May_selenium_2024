package oops;
//parent - super - base
class A
{
	int a=10;
	
	public void sample()
	{
		System.out.println("Running smaple method....of class A");
	}
}
//child - sub - derived
class B extends A
{
	int a = 50;
	public void run()
	{
		int a = 100;
		System.out.println("a : "+a);
		System.out.println("a : "+this.a);
		System.out.println("a : "+super.a);
		System.out.println("Runing run method of b");
	}
}
class C extends A
{
	
}

public class O005_InheritanceDemo {
	public static void main(String[] args) {
		
		
//		A a = new A();
//		a.sample();
		
		B b = new B();
		//b.sample();
		b.run();
	}
}