package Inter;

import java.util.HashSet;
import java.util.Set;

public class DuplicateBySet {
public static void main(String[] args) {
	
	int arr[]= {1,3,5,2,3,5,6,7,1,7};
	
	System.out.println(arr.length);
	Set<Integer> set=new HashSet<Integer>();
	
	for(int i=0;i<=arr.length-1;i++)
	{
		if(!set.add(arr[i]))
		{
			System.out.println("Duplicate Element is "+arr[i]);
		}
	}
	
}
}
