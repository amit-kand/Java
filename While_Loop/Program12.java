//12).Write a Java program using while loop to check whether a given number is a Strong number or not.
//Example: 145 → 1! + 4! + 5! = 145
import java.util.*;
class Program12 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any number :");
		int num = s.nextInt();
		int sum = 0;
		int b = num;
		while (0<num)
		{
			int fact = 1;
			int a = num%10;
			while(1<=a){
				fact = fact*a;
				a--;
			}
			sum = sum+fact;
			num = num/10;
		}
		if (b ==sum)
		{
			System.out.println(b+" is strong number.");
		}
		else{
			System.out.println(b+" is not strong number.");
		}
		
	}
}
