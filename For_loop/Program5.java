//5)Write a Java program to find the factorial of a given number using a for loop
import java.util.*;
class Program5 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number :");
		int num = s.nextInt();
		int fact = 1;
		for (int i = num;1<=i ;i-- )
		{
			fact = fact*i;
		}
		System.out.println(fact);
	}
}
