package Inter;

public class SumofDigit {

	static int num=2019;
	static int sum=0;
	public static void main(String[] args) {
		while(num>0)
		{
		sum=sum+(num%10);
		num=num/10;
		
		}
		System.out.println(sum);
		
	}
}
