package basic;

public class B002_Datatypes {
	public static void main(String[] args) {
		
		
			byte b = -128;
			short s = 125;
			int i = 5656;
			long l = 66565;
			
			float f = 23.565665464f;
			double d = 133.556546565656;
			
			//System.out.println(f);
			//System.out.println(d);
			
			char ch = 'A';
			boolean bool = true;
			
			char c = 35;
			System.out.println(c);
			
			
			int k = 'A';
			System.out.println(k);
		
			//datatype casting
			
			
			//widening - implicite
			int a = 10;   //4
			long a1 = a;  //8
			
			
			//nerrowing - explicite
			long x = 5656;        //8
			int y = (int) x;     //4
		
	}
}
