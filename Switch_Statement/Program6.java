//6). Write a java program to accept one character cheak wheather it is vowel or not.
import java.util.*;
class Program6 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a character for checking it is vowel or not :");
		char ch = s.next().charAt(0);
		switch(ch){
			case 'a':
				System.out.println(ch+" is vowel character.");
				break;
			case 'e':
				System.out.println(ch+" is vowel character.");
				break;
			case 'i':
				System.out.println(ch+" is vowel character.");
				break;
			case 'o':
				System.out.println(ch+" is vowel character.");
				break;
			case 'u':
				System.out.println(ch+" is vowel character.");
				break;
			case 'A':
				System.out.println(ch+" is vowel character.");
				break;
			case 'E':
				System.out.println(ch+" is vowel character.");
				break;
			case 'I':
				System.out.println(ch+" is vowel character.");
				break;
			case 'O':
				System.out.println(ch+" is vowel character.");
				break;
			case 'U':
				System.out.println(ch+" is vowel character.");
				break;
			default:
				System.out.println(ch+" is not vowel. it is constant.");
		}
		
	}
}
