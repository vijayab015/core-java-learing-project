package Inter;

import java.util.Arrays;

public class MyArrayImp {
	static int actualSize = 0;
	static Object[] mydata;

	public static void main(String[] args) {

		MyArrayImp al = new MyArrayImp();
		al.add("XYZ");
		al.add("Vijay Bharti");
		al.add("abc");
		al.add("klm");
		System.out.println(al.remove(1));
		System.out.println(al.get(1));
	}

	public MyArrayImp() {
		mydata = new Object[10];
	}
    public static void add(Object obj) {
		if (mydata.length - actualSize <= 5) {
			incraseSize();
		}
		mydata[actualSize++] = obj;
	}
    public static void incraseSize() {
		mydata = Arrays.copyOf(mydata, mydata.length * 2);
	}
  public static Object get(int index) {
		if (index > actualSize) {
			return "ArrayOutofBooundException";
		}
		return mydata[index];
	}

	public static int size() {
		return actualSize;
	}

	public static Object remove(int index) {
		if (index < actualSize) {
			Object obj = mydata[index];
			mydata[index] = null;
			int temp = index;
			while (temp < actualSize) {
				mydata[temp] = mydata[temp + 1];
				mydata[temp + 1] = null;
				temp++;
			}
			actualSize--;
			return obj;

		} else {
			return "ArrayOutofBooundException";
		}

	}

}
