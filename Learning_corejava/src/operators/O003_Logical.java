package operators;

public class O003_Logical {
	public static void main(String[] args) {
		
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("****************");
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false ||true);
		System.out.println(false || false);
		
		System.out.println("*****************");
		
		
		//System.out.println(10>20 || 10<20);
		
		String uname = "admin";
		String pass = "admin1";
				
		
		System.out.println(uname.equals("admin") && pass.equals("admin"));
		
		
	}
}
