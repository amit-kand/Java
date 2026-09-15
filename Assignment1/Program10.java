import  java.util.*;
class Program10 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number :");
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int sum = 0;

		while (n > 0) {
			int digit = n%10;
			sum = sum + digit;
			n = n / 10;
		}

		System.out.println(sum);
	}
}
