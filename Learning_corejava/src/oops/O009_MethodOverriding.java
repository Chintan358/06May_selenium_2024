package oops;


class P
{
	public void display()
	{
		System.out.println("Display of P calling");
	}
}

class Q extends P
{
	@Override
	public void display() {
		System.out.println("Display of Q calling");
	}
}

public class O009_MethodOverriding {
	public static void main(String[] args) {
		
		Q q = new Q();
		q.display();
	}
}
