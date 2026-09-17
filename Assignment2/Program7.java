//7) Write a Java program to display all strong numbers in a given range.
import java.util.*;
class Program7
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter starting number :");
		int start = s.nextInt();
		System.out.print("Enter endding number :");
		int end = s.nextInt();
		for(int j = start;j<=end;j++){
			int n = j;
			int original = n;
			int sum = 0;
			while(n>0){
				int digit = n% 10;
				int fact = 1;
				for (int i = 1;i<=digit ;i++ )
				{
					fact = fact * i;
				
				}
				sum = sum + fact;
				n = n /10;
			}
			if(sum == original){
				System.out.println(sum);
			}
		}
		
	}
}
