package Inter;

public class ArrayRot {
	public static void main(String[] args)

	{

		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int temp = a[0];
		int i;
		for (i = 0; i < a.length - 1; i++) {
			a[i] = a[i + 1];
		}
		a[i] = temp;
		for (int j = 0; j < a.length; j++) {
			System.out.print(" " + a[j]);
		}

	}

}
