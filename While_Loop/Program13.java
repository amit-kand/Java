//13).Write a Java program using while loops to print all prime numbers between 1 and 100.
import java.util.*;
class Program13 
{
	public static void main(String[] args) 
	{
		int num = 2;
		while (num<=100)
		{
			int a = 2;
			while(a<num&&num%a!=0){
				
				
				
				a++;
			}
			if(num==a){
					System.out.println(num);
					}
			num++;
				
		}
	}
}
