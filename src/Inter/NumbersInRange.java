package Inter;

import java.util.Scanner;

public class NumbersInRange {

	public static void main(String[] args) {
	    
	    
		Scanner s = new Scanner(System.in);
	    
	    // Get L and R from the input
		int L = s.nextInt();
		int R = s.nextInt();
    
        for(int i=L;i<=R;i++)
        {
            System.out.print(i +" ");
        }
        
        
        
        
        

		s.close();
	}
}
