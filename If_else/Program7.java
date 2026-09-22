//7).Write a Java program to find the greatest among three numbers.
import java.util.*;
class Program7 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first number");
		int a = s.nextInt();
		System.out.print("Enter second number");
		int b = s.nextInt();
		System.out.print("Enter third number");
		int c = s.nextInt();
		if (a>b && a>c)
		{
			System.out.println(a+" is greater number.");
		}
		else if(b>a&&b>c){
			System.out.println(b+" is greater number.");
		}
		else{
			System.out.println(c+" is greater number.");
		}
	}
}
