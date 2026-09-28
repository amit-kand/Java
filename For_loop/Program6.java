//6)Write a Java program to print the multiplication table of a given number.
import java.util.*;
class Program6 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any number :");
		int num = s.nextInt();
		int N=0;
		
		for (int i = 1;i<=10 ;i++ )
		{
			
			N = num+N;
			System.out.println(N);
		}
	}
}
