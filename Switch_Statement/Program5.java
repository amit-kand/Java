/*5). Write a java program to create menu driven program
1--->add
2--->subtract
3--->multiply
4--->divide
*/
import java.util.*;
class Program5 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first number:");
		double a = s.nextDouble();
		System.out.print("Enter second number:");
		double b = s.nextDouble();
		
		System.out.println("----Menu----");
		System.out.println("1-->Addition");
		System.out.println("2-->Subtraction");
		System.out.println("3-->Multilpication");
		System.out.println("4-->Division");
		System.out.println("Selete one opertion(1-4).");
		int num = s.nextInt();
		double c =0;
		switch(num){
			case 1:
				c = a+b;
				System.out.println("Addition is "+c);
				break;
			case 2:
				c = a-b;
				System.out.println("Subtraction is "+c);
				break;
			case 3:
				c = a*b;
				System.out.println("Multiplication is "+c);
				break;
			case 4:
				c = a/b;
				System.out.println("Division is "+c);
				break;
			default:
				System.out.println("Enter valide number(1-4).");
				break;
				
		}
		
	}
}
