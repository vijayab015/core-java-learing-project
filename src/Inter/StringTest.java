package Inter;

public class StringTest {
	public static void main(String[] args) {
		String s="/rest/dm/node/properties?parentpath=/ababa&nodetype=folder";
		int index=s.indexOf('?');
		//System.out.println(index);
		String path=s.substring(0, index);
		System.out.println(path);
		
	}

}
