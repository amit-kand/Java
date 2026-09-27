//11).Write a Java program using while loop to check whether a given number is an Armstrong number or not
import java.util.*;
class Program11  
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any number :");
		int num = s.nextInt();
		int count = 0;
		int digit = num;
		int c = num;
		while (0<num)
		{
			int b = num%10;
			count+=1;
			num = num/10;
			
		}
		int sum = 0;
		while(0<digit){
			int a = digit%10;
			sum +=(Math.pow(a,count));
			digit = digit/10;
		}
		if (c==sum)
		{
			System.out.println(c+" is armstrong number.");
		}
		else{
			System.out.println(c+" is not armstrong number.");
		}
	
		
	}
}
