package oops;

class Demo
{
	static int count = 0;
	Demo()
	{
		count++;
		//System.out.println(count);
	}
}

public class O004_Objectcount {
	public static void main(String[] args) {
		
		Demo d = new Demo();
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = new Demo();
		Demo d4 = new Demo();
		
		System.out.println("total objects : "+Demo.count);
	}
}
