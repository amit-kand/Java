//7).Write a Java program to reverse a given number using a while loop.
import java.util.*;
class Program7 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number :");
		int num = s.nextInt();
		while (0<=num)
		{
			System.out.println(num);
			num--;
		}
	}
}
