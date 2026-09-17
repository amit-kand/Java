//3) Write a Java program to display all armstrong numbers in a given range.
import java.util.*;
class Program3 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the starting number :");
		int start = s.nextInt();
		System.out.print("Enter endding number :");
		int end = s.nextInt();
		for(int i = start;i<=end;i++){
			int num = i;
			int original = num;
			int pali = num;
			int count = 0;
			while (num>0)
			{
				count++;
				num = num/10;
			}
		
		
			int result = 0;
			while (original > 0) {
			int digit = original%10;
			
			double re = Math.pow(digit,count);
			result += re; 	
			original = original / 10;
			
			}
			if (result == pali )
			{
				System.out.println(result);
			}
			
		}
		
	}
}
