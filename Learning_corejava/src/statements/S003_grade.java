package statements;

import java.util.Scanner;

public class S003_grade {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks : ");
		int marks = sc.nextInt();
		
		//90-100 - A
		//70 - 89 = B
		//50 - 69 - C
		//35 - 49 = D
		//0- 34 - fail
		
		if(marks>=90 && marks<=100)
		{
			System.out.println("grade A");
		}
		else if(marks>=70 && marks<90)
		{
			System.out.println("grade B");
		}
		else if(marks>=50 && marks<70)
		{
			System.out.println("grade C");
		}
		else if(marks>=35 && marks<50)
		{
			System.out.println("Grade D");
		}
		else if(marks>=0 && marks<35)
		{
			System.out.println("grade F");
		}
		else
		{
			System.out.println("Invalid marks");
		}
		
		
	}
}
