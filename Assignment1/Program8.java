import java.util.*;
class Program8 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter starting number :");
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		System.out.print("Enter endding number :");
		int end = s.nextInt();
		for (int i = start;i<=end ;i++ )
		{
			boolean b = true;
			for (int j = 2;j<i ;j++ )
			{
				if(i%j==0){
					b = false;
					break;
				}
			}
			if(b)
				System.out.println(i);
		}
		
	}
}
