package Inter;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		
		try {
				
			System.out.println(10/0);
			
		}
		catch(ArithmeticException a)
		{
			System.out.println("you are not supposed to bevide any number by zero");
			System.exit(0);
		}
		finally
		{
			System.out.println("hello");
		}

	}

}
