package oops;

interface I1
{
	public void run();
}

interface I2
{
	public void run();
}

class K
{
	
}

class Interimpl extends K implements I1,I2
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

public class O011_InterfaceDemo {
	public static void main(String[] args) {
		
		
		Interimpl i = new Interimpl();
		i.run();
		
	}
}
