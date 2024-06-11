package exception;

class Demo
{
	public void test() throws ClassNotFoundException
	{
		
		Class.forName("basic.B001_Identifier");
	
	}
	
}

public class E002_compile {
	public static void main(String[] args) {
		
		
		Demo d = new Demo();
		try {
			d.test();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
		
	}
}
