//4).Write a Java program to check whether a person is eligible to vote or not. (Age ≥ 18)
import java.util.*;
class Program4 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter age of any person. :");
		Scanner s = new Scanner(System.in);
		int Age = s.nextInt();
		if (Age>= 18)
		{
			System.out.println(Age+" age of person eligible to vote.");
		}
		else{
			System.out.println(Age+" age of person eligible to vote.");
		}	
	}
}
