/*Income Tax Calculator
Write a Java program to calculate tax based on annual income:

Up to ₹2,50,000 → No tax
₹2,50,001–₹5,00,000 → 5%
₹5,00,001–₹10,00,000 → 20%
Above ₹10,00,000 → 30%*/

import java.util.*;
class Program13 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter annual income");
		int income = s.nextInt();
		int tax;
		if (income<=250000)
		{
			System.out.println("No Tax");
		}
		else if(income>=250001&&income<=500000){
			System.out.println("5% Tax");
			tax = income*5/100;
			System.out.println("The tax ammount is "+tax);
		}
		else if(income>=500001&&income<=1000000){
			System.out.println("20% Tax");
			tax = income*20/100;
			System.out.println("The tax ammount is "+tax);
		}
		else{
			System.out.println("30% Tax");
			tax = income*30/100;
			System.out.println("The tax ammount is "+tax);
		}
	}
}
