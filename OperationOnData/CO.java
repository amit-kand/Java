class A
{
	A(){
		int a= 10,b=9;
		int c = a==b?a:b;
		System.out.println(c);
	}
}

class B
{
	B(){
		int a = 10,b=9;
		int c = a<b?a:b;
		System.out.println(c);
		
	}
}

class C
{
	C(){
		int a = 10,b=5;
		int c = a>b?a:b;
		System.out.println(c);
	}
}

class D
{
	D(){
		int a = 10,b=19,c=17;
		int d = a<b&&a<c?a:b>c?b:c;
		System.out.println(d);
	}
}
class ConditionalOperator 
{
	public static void main(String[] args) 
	{
		System.out.println("hii");
		new A();
		System.out.println("hii");
		new B();
		System.out.println("hii");
		new C();
		System.out.println("hii");
		new D();
	}
}
