//14)Write a Java program using a while loop to count how many times a particular digit occurs in a given number.
//Example: 1223452, digit 2 → occurs 3 times.
import java.util.*;
class Program14 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any number of number :");
		int num = s.nextInt();
		System.out.print("Enter digit to find in number :");
		int digit = s.nextInt();
		int count = 0;
		while (0<num)
		{
			int a = num%10;
			if (a==digit)
			{
				count++;
			}
			num = num/10;
			
			
			}
			System.out.println(count);
		}
	
}
