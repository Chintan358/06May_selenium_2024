package array;

public class A003_ArrayOpration {
	public static void main(String[] args) {
		
		
		
		int a[] = {10,20,5,6,41,52,98,45,123};
		
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) 
		{
			sum = sum +a[i];
		}
		
		
		
		
		System.out.println("sum :"+sum);
		System.out.println("avg : "+(sum/a.length));
		
		
		
	}
}