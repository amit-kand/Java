//basic user define value calculator
class Demo
{
	void show(){
		int a = 10,b =13, c = 6;
		int d =((a/b+c%a)*(a-b+c/b));
		System.out.println(d);
		
	}
} 
class ArithmaticsOperators 
{
	public static void main(String[] args) 
	{
		Demo h = new Demo();
		h.show();
		
		int a = 10,b=5;
		int c=a+b;
		int d=a-b;
		int e=a/b;
		int f=a*b;
		int g=a%b;
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
	}
}

