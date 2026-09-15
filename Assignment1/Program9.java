import java.util.*;
class Program9 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number :");
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int count = 0;

		while (n > 0) {
			count++;
			n = n / 10;
		}

		System.out.println(count);
	}
}
