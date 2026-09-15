class A
{
	A(){
		int a = 11,b =13;
		int c = a&b;
		int d = a|b;
		int e = a^b;
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}

class B
{
	B(){
		int a =9;
		int b = a<<2;
		int c = a>>2;
		int d = ~a; // formulla to find compliment (-(a+1)) = -(9+1) = -10ans
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

class C
{
	C(){
		int a = 9,b = 5, c =13;
		boolean d = a>b&& ++a>c;
		System.out.println(d);
		System.out.println(a);
	
	}
}

class D
{
	D(){
		int a = 9,b = 5, c =13;
		boolean d = a>b& ++a>c;
		System.out.println(d);
		System.out.println(a);
	
	}
}

class E
{
	E(){
		int a =9,b=5,c=13;
		boolean d = a<b || a>c++;
		boolean e = a<c || a++>b;
		System.out.println(d);
		System.out.println(c);
		System.out.println(a);
	}
}

class F
{
	F(){
		int a =9,b=5,c=13;
		boolean d = a<b | a>c++;
		System.out.println(d);
		System.out.println(c);
	}
}
class  Practice1
{
	public static void main(String[] args) 
	{
		
		new A();
		System.out.println("Hello World!");
		new B();
		System.out.println("Hello World!");
		new C();
		System.out.println("Hello World!");
		new D();
		System.out.println("Hello World!");
		new E();
		System.out.println("Hello World!");
		new F();
	}
}
