package impclasses;

public class I004_Wrapper {
	public static void main(String[] args) {
		
		
		int i = 10;
		//boxing
		Integer k = new Integer(i);
		//autoboxing
		Integer l = i;
		
		
		Integer j = 52;
		//unboxing
		int a = j.intValue();
		//autounboxing
		int b = j;
		
		
		int x = 14526543;
		Integer y = x;
		int length =  y.toString().length();
		System.out.println(length);
	}
}
