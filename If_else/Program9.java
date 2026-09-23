/*Write a Java program to calculate grade based on marks:

90–100 → A
75–89 → B
60–74 → C
40–59 → D
Below 40 → Fail*/

import java.util.*;
class Program9 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter marks to calculate grade :");
		int marks = s.nextInt();
		if (marks>=90 && marks<=100)
		{
			System.out.println("Student got grade A");
			
		}
		else if(marks>=75 && marks<=89){
			System.out.println("Student got grade B");
		}
		else if(marks>=60 && marks<=74){
			System.out.println("Student got grade C");
		}
		else if(marks>=40 && marks<=59){
			System.out.println("Student got grade D");
		}
		else{
			System.out.println("Student is fail");
		}
		
	}
}
