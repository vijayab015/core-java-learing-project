package Inter;

public class Arr {

	public static void main(String[] args) {
		int array[] = {1,3,5,-5,4,5,-4};
        System.out.println(maxSum(array));
		
	}
	public static int maxSum(int a[])
	{
		int size=a.length;
		int max_end_here=0;
		int max_till_now=0;
		for(int i=0;i<size;i++)
		{
			max_end_here=max_end_here+a[i];
			if(max_till_now < max_end_here)
			  max_till_now =max_end_here;
			
			if(max_end_here < 0)
				max_end_here=0;
			
				
		}
		return max_till_now;
		
	}
}
