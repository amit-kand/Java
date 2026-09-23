/*Three-Digit Number Analysis
Write a Java program to accept a three-digit number and check:

Whether it is a palindrome
Whether the first digit is greater than the last digit
Whether the sum of its digits is even or odd*/

import java.util.*;
class Program14 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter three digit number");
		int num = s.nextInt();
		int sum = 0,digit,rev=0,a=num;
		int first = num / 100;
        int last = num % 10;
        int middle = (num / 10) % 10;
		while(num>0){
			digit = num%10;
			rev = rev*10+digit;
			sum = sum+digit;
			num = num/10;
		}
		
		//Whether it is a palindrome
		if(rev==a)
		{
			System.out.println(a+" is palinbrome number.");
		}
		else{
			System.out.println(a+" is not palindrome number.");
		}
		
		//Whether the first digit is greater than the last digit
		if (first > last) {
            System.out.println("First digit is greater than last digit");
        } else if (first < last) {
            System.out.println("First digit is smaller than last digit");
        } else {
            System.out.println("First digit and last digit are equal");
        }
		
		//Whether the sum of its digits is even or odd
		if (sum%2 ==0)
		{
			System.out.println(a+" this digit sum is even number.");
		}
		else{
			System.out.println(a+"this digit sum is odd number.");
		}
	}
}
