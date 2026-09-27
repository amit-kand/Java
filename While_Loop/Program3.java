//3).Write a Java program to print all even numbers from 1 to 100.
class Program3 
{
	public static void main(String[] args) 
	{
		int num = 1;
		while (num<=100)
		{
			if (num%2==0)
			{
				System.out.println(num);
			}
			num++;
		}
		int a = 0;
		while (a<=100)
		{
			System.out.println(a);
			a+=2;
		}
	}
}
