//4).Writea java program to accept a number (1-4) and print the corsponding season.
import java.util.*;
class Program4 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number(1-4) to print season :");
		int num = s.nextInt();
		switch(num){
			case 1:
				System.out.println("Summer");
				break;
			case 2:
				System.out.println("Mansoon");
				break;
			case 3:
				System.out.println("Wintter");
				break;
				
			case 4:
				System.out.println("Sring");
				break;
				
			default:
				System.out.println("Enter valid number(1-4).");
				break;
		}
	}
}
