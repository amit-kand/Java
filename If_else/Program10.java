//10).Write a Java program to check whether a given character is a vowel or consonant.
import java.util.*;
class Program10 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any character :");
		char ch = s.next().charAt(0);
		if (ch == 'a'|| ch == 'A')
		{
			System.out.println(ch+" is vowel character");
		}
		else if(ch == 'e' || ch == 'E'){
			System.out.println(ch+" is vowel character");
		}
		else if(ch == 'i'|| ch == 'I'){
			System.out.println(ch+" is vowel character");
		}
		else if(ch == 'o' || ch == 'O'){
			System.out.println(ch+" is vowel character");
		}
		else if(ch == 'u' || ch == 'U'){
			System.out.println(ch+" is vowel character");
		}
		else{
			System.out.println(ch+" is constand character.");
		}
		
	}
}
