//5).Write a Java program to calculate the sum of numbers from 1 to N.
import java.util.*;
class Program5 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number of N :");
		int num = s.nextInt();
		int n = 1;
		int sum = 0;
		while (n<=num)
		{
			sum = sum+n;
			n++;
		}
		System.out.println("sum of 1 to "+num+" numbers is "+sum);
	}
}
