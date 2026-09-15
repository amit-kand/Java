import java.util.*;
class Program1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number :");
		int a = s.nextInt();
		for (int i = 1;i<=a ;i++ )
		{
			if(a%i==0)
				System.out.println(i);
		}
	}
}
