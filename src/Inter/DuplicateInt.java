package Inter;

public class DuplicateInt {

	public static void main(String[] args) {
		
	
		int arr[]= {1,3,5,2,3,5,6,7,1,7};
		
	//	output 1,2,5,6
	
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicated Element "+arr[i]);
				}
			}
			
		}
		
		/*
		 * for(int a:arr) { System.out.print(a +" ");
		 * 
		 * }
		 */
		
	
	}
}
