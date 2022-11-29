package Inter;

public class DuplicateString {

	public static void main(String[] args) {
		
		
		String s[]= {"vij","ajay","sym","vij","test","test"};
		
		for(int i=0;i<=s.length-1;i++)
		{
			for(int j=i+1;j<=s.length-1;j++)
			{
				if(s[i].equals(s[j]))
				{
					System.out.println("Duplicate element "+s[i]);
				}
			}
		}
		
	}

}
