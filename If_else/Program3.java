//3).Write a Java program to find the greater of two numbers.
import java.util.*;
class Program3 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first number  :");
		int num1 = s.nextInt();
		System.out.print("Enter second numer :");
		int num2 = s.nextInt();
		if (num1>num2)
		{
			System.out.println(num1+" is greater than "+num2);
		}
		else if(num1<num2)
		{
			System.out.println(num2+" is greather than "+num1);
		}
		else
		{
			System.out.println(num1+" is equal to "+num2);		
		}
	}
}
