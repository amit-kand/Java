//4) Write a Java program to calculate the factorial of a given number.
import java.util.*;
class Program4 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number :");
		int n = s.nextInt();
		int factorial = 1;

		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}

		System.out.println(factorial);
	}
	
}
