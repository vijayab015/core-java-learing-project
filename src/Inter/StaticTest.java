package Inter;

public class StaticTest {

	static
	{
		System.out.println("i m static");
	}
	
	public StaticTest()
	{
		System.out.println("hello");
	}

	
	public static void main(String[] args) 
	{
		StaticTest s=new StaticTest();

	}

}
