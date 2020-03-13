package Inter;

public class PerfectSquare {
	
	public static void main(String[] args) {
		int num=16;
		 double temp;
		 double sr=num/2;
		 do {
			 temp=sr;
			 sr=(temp +(num/temp))/2;
			 
		 }
		 while(temp -sr != 0);
		 System.out.println("Square root is "+sr);
		 
	}
	

}
