import java.util.*;
class Program7 
{
	public static void main(String[] args) 
	{
		for(int j = 1;j<=1000;j++){
			boolean b = true;
			for (int i = 2;i<j ;i++ )
			{
			if(j%i==0){
				b = false;
				break;
			}
		}
		if (b)
		{
			System.out.println(j);
		}
		}
		
		
			
	}
}
