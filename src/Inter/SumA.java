package Inter;

public class SumA {
	public static void main(String[] args) {
		int a[]= {2,1,-3,4,-1,2,1,-5,4};
     System.out.println(maxSum(a));
	}

	static int maxSum(int a[]) {
		int size = a.length;
		int max_so_far = 0;
		int max_ending_here = 0;

		for (int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + a[i];
			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
			if (max_ending_here < 0)
				max_ending_here = 0;
		}
		return max_so_far;
	}
}