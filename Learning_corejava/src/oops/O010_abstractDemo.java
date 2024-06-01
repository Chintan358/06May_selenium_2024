package oops;

abstract class Abs
{
	public abstract void show();
	
	public void disp()
	{
		System.out.println("runing disp...");
	}
}

class AbsImpl extends Abs
{

	@Override
	public void show() {
		System.out.println("running show....");
		
	}
	
}

public class O010_abstractDemo {
	public static void main(String[] args) {
		
		//Abs abs = new Abs();
		AbsImpl abs = new AbsImpl();
		abs.show();
	}
}
