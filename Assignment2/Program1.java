//1) Write a Java program to check whether given number is an armstrong or not?
import java.lang.*;
import java.util.*;
class Program1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int num = s.nextInt();
		int original = num;
		int pali = num;
		int count = 0;
		while (num>0)
		{
			count++;
			num = num/10;
		}
		
		
		int result = 0;
		while (original > 0) {
			int digit = original%10;
			
			double re = Math.pow(digit,count);
			result += re; 	
			original = original / 10;
			
		}
		if (result == pali )
		{
			System.out.println("The number is armstrong Number.");
		}
		else{
			System.out.println("The number is not Armstrong number.");
		}
		
	}
}
