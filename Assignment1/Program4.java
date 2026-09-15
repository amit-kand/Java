import java.util.*;
class Program4
{
	public static void main(String args[])
		
	{
		System.out.print("Enter starting Number :");
		Scanner s =new Scanner(System.in);
		int start = s.nextInt();
		System.out.print("Enter ending Number :");
		int end = s.nextInt();
		for (int i = start;i<=end ;i++ )
		{
			int sum = 0;
			for (int a = 1;a<i ;a++ )
			{
				if (i%a==0)
					
				{
					sum = sum +a;
				}
				
			}
			if (sum == i)
				{
					System.out.println(i);
				}
		}
	
	}
}