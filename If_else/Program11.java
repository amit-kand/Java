/*Electricity Bill Calculator
Write a Java program to calculate the electricity bill based on units consumed:

0–100 units → ₹5/unit
101–200 units → ₹7/unit
201–300 units → ₹10/unit
Above 300 units → ₹15/unit*/

import java.util.*;
class Program11 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the units :");
		int unit = s.nextInt();
		int total;
		if (unit>=0 && unit<=100)
		{
			total = unit*5;
			System.out.println("Total bill amount is "+total+"rs");
		}
		else if(unit>=101 && unit<=200)
		{
			total = unit*7;
			System.out.println("Total bill amount is "+total+"rs");
		}
		else if(unit>=201&& unit<=300)
		{
			total = unit*10;
			System.out.println("Total bill amount is "+total+"rs");
		}
		else 
		{
			total = unit*15;
			System.out.println("Total bill amount is "+total+"rs");
		}
	}
}
