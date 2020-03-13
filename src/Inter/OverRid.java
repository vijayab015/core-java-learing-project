package Inter;

public class OverRid
{
	public static void main(String[] args) {
		
		A a=new B();
		a.display(10);
		B b =new B();		
	}

}

class A {
	int x=20;
	public void display(int x) 
	{
		System.out.println(x);
	}
}

class B extends A 
{
	int i=10;
	public void display(String x) 
	{
		System.out.println("Ov"+x);
		
	}
	
	
}