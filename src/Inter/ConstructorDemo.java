package Inter;

public class ConstructorDemo {

	// B2 b = new B2(10);
	public static void main(String[] args) {
		A2 a1 = new A2();
	}
	

}

class A2 {
	A2(int a) {
		System.out.println(a);
	}

	public void d() {
		System.out.println("Hi");
	}

	A2() {

	}
}

class B2 extends A2 {
	B2(int b) {
		System.out.println(b);
	}
	B2()
	{
		
	}

}
