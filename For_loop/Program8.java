//8)Write a Java program to print all prime numbers between 1 and 100.

class Program8 
{
	public static void main(String[] args) 
	{
		for (int i =1;i<=100 ;i++)
		{
			int count = 0;
			int num = i;
			for (int j =2;j<i ;j++)
			{
				if (i%j==0)
				{
					count++;
				}
			}
			if (count ==0)
			{
				System.out.println(num);
			}
		}
	}
}
