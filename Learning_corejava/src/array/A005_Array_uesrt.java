package array;

import java.util.Scanner;

public class A005_Array_uesrt {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array : ");
		int size = sc.nextInt();
		
		String sub[] = new String[size];
		
		for (int i = 0; i < sub.length; i++) {
			System.out.println("enter subject for index : "+i);
			sub[i] = sc.next();
		}
		
		
		
		for (int i = 0; i < sub.length; i++) {
			System.out.println(sub[i]);
		}
		
		
		
	}
}
