//2)Write a Java program to print all even numbers from 1 to 100.
class Program2 
{
	public static void main(String[] args) 
	{
		for (int i = 0;i<=100 ;i=i+2 )
		{
			System.out.println(i);
		}
		for (int j = 0;j<=100 ;j++ )
		{
			if (j%2==0)
			{
				System.out.println(j);
			}
		}
	}
}
