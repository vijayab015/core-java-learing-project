package Inter;

public class OddPlaceStr {

	public static void main(String[] args) {

		String name = "vijay";
		char[] c = name.toCharArray();

		for (int i = 0; i < c.length - 1; i++) {
			char temp = c[i];
			c[i] = c[i + 1];
			c[i + 1] = temp;
			i++;

		}
		for (char c1 : c) {

			System.out.print(c1 + " ");

		}

	}

}
