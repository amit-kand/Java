//9).Write a Java program to find the sum of digits of a given number.
import java.util.*;
class Program9

{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter any digit :");
		int digit = s.nextInt();
		int sum = 0;
		while (0<digit)
		{
			int na = digit%10;
			sum = sum+na;
			digit = digit/10;
		}
		System.out.println(sum);
	}
}
