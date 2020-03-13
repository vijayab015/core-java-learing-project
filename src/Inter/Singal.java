package Inter;

public class Singal {
	
	public static void main(String[] args) {
		Abc a = Abc.getInstance();
		a.m1();
		
		Abc b=Abc.getInstance();
		System.out.println(a.hashCode());
	}

}

class Abc
{
	static Abc obj=new Abc();
	private Abc()
	{
		
	}
	public static Abc getInstance()
	{
		return obj;
	}
	public void m1()
	{
		System.out.println("in ABC");
	}
	
	
	}

class XYZ
{
	}
