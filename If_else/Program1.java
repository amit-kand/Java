//1).Write a Java program to check whether a number is positive, negative, or zero.
import java.util.*;
class Program1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any number. :");
		int num = s.nextInt();
		if (num > 0)
		{
			System.out.println(num+" is positive number.");
		}
		else if(num<0)
		{
			System.out.println(num+" is negative number. ");
		}
		else
		{
			System.out.println(num+" the number is zero");
		}
	}
}
