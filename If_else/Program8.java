//8).Write a Java program to check whether a student has passed or failed.(Passing marks ≥ 40)
import java.util.*;
class Program8 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter student marks :");
		int marks = s.nextInt();
		if (marks >= 40)
		{
			System.out.println("Student is pass.obtain marks is "+marks);
		}
		else{
			System.out.println("Student is fail.Take reexam.");
			System.out.print("Enter re exam marks .:");
			int remarks = s.nextInt();
			if (remarks>=40)
			{
				System.out.println("Student is pass.obtain marks is "+remarks);
			}
			else{
				System.out.println("Student is fail.");
			}
		}
	}
}
