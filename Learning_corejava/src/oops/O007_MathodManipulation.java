package oops;

import java.util.Iterator;

class Calc
{
	public void sample()
	{
		System.out.println("Sample callling...");
	}
	
	public void square(int a)
	{
		System.out.println("Square of "+a+" is : "+(a*a));
	}
	
	public void add(int a, int b)
	{
		System.out.println("addition of "+a+" and "+b+" is "+(a+b));
	}
	
	public int cube(int i)
	{
		int c = i*i*i;
		return c;
	}
	
	public void addArray(int a[])
	{
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum +a[i];
		}
		System.out.println("sum is : "+sum);
	}
	
	public void display(int...s)
	{
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
	
	
}

public class O007_MathodManipulation {
	public static void main(String[] args) {
		
		Calc c = new Calc();
		c.sample();
		c.square(25);
		c.add(10, 20);
		c.add(50, 60);
		
		int k = c.cube(10);
		System.out.println(k);
		System.out.println(c.cube(20));
		
		
		int a[] = {10,20,30,40,50};
		c.addArray(a);
		
		c.display(10,20,30,40,50);
	}
}