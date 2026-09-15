import java.util.*;
class Program3 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number :");
		int a = s.nextInt();
		int sum = 0;
		for (int i = 1;i<a ;i++ )
		{
			if(a%i==0)
				sum = sum +i;
			
		}
		if (sum == a)
		{
			System.out.println("Nuber is perfect ");
		}
		else
		{
			System.out.println("Not perfect ");
		}
	}
}
