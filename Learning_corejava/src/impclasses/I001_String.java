package impclasses;

public class I001_String {
	public static void main(String[] args) {
		
		//immutable
		//String str1 = new String("Shivam");
		//System.out.println(str1);
		
//		String str = "Nitesh";
//		String s =  str.concat("shivam");
//		System.out.println(s);
		
		
		
		String s1 = new String("Java");
		String s2 = new String("php");
		String s3 = new String("Java");
		
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		
		System.out.println("*********************");
		
		
		String str1 = "Java";
		String str2 = "php";
		String str3 = "Java";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1==str3);
		
		
		
		
		
	}
}
