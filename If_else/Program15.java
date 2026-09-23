/*15).Student Result System
Write a Java program to accept marks of 5 subjects and calculate the percentage. Then determine:

Fail if any subject is below 35
Distinction if percentage ≥ 75
First Class if percentage ≥ 60
Second Class if percentage ≥ 50
Pass Class if percentage ≥ 35
*/

import java.util.*;
class Program15 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

        System.out.println("Enter marks of 5 subjects:");

        int m1 = s.nextInt();
        int m2 = s.nextInt();
        int m3 = s.nextInt();
        int m4 = s.nextInt();
        int m5 = s.nextInt();

        int total = m1 + m2 + m3 + m4 + m5;
        double percentage = total / 5.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35) {
            System.out.println("Result: Fail");
        }
        else if (percentage >= 75) {
            System.out.println("Result: Distinction");
        }
        else if (percentage >= 60) {
            System.out.println("Result: First Class");
        }
        else if (percentage >= 50) {
            System.out.println("Result: Second Class");
        }
        else {
            System.out.println("Result: Pass Class");
        }
		
	}
}
