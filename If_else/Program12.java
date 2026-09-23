/***Triangle Validity and Type**

Write a Java program to check whether three given sides can form a triangle. If valid, determine whether it is:

-  Equilateral 
-  Isosceles 
-  Scalene

only explaination not give program */

import java.util.*;
class Program12 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter triangle first side:");
		int a = s.nextInt();
		System.out.println("Enter triangle second side:");
		int b = s.nextInt();
		System.out.println("Enter triangle Third side:");
		int c = s.nextInt();
		if (a+b>c&&a+c>b&&b+c>a)
		{
			if(a==b&&b==c){
				System.out.println("The triangle is Equilateral. ");
			}
			else if(a==b||b==c||c==a){
				System.out.println("The triangle is Isosceles  . ");
			}
			else{
				System.out.println("The triangle is Scalene. ");
			}
				
		}
		else{
			System.out.println("It is not triangle. ");
		}
	}
}
