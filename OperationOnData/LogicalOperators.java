// logical and (&&) operator, Logical OR(||) operator, Logical Not (!) operator
class Op
{
	Op(){
		int a =10,b=9,c=3;
		boolean d = !(a!=b||b==c);
		System.out.println(d);
	}
	
}
class Demo
{
	void show()
	{
		new Op();
		int a =12 , b = 13 , c = 14;
		boolean d = a!=b || b<c;
		boolean e = a==b || b>c;
		System.out.println(d);
		System.out.println(e);
	}
}
class LogicalOperators 
{
	public static void main(String[] args) 
	{
		int a =12 , b = 13 , c = 14;
		boolean d = a<b && b<c;
		boolean f = a>b && b<c;
		System.out.println(d);
		System.out.println(f);
		Demo e = new Demo();
		e.show();
		
		
	}
}
