package operators;

public class O004_Unary {
	public static void main(String[] args) {
		
		
			int a = 10;
			int b = a++ + a++ - a-- + --a;
			       
			
			System.out.println(a);//10
			System.out.println(b);//10
		
		
	}
}
