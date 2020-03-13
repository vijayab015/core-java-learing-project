package Inter;

import java.io.FileInputStream;
import java.io.IOException;

public class Tesy {
	public static void main(String[] args) throws IOException {
		printFile();
	}
	
	private static void printFile() throws IOException {

	    try(FileInputStream input = new FileInputStream("file.txt")) {

	        int data = input.read();
	        while(data != -1){
	            System.out.print((char) data);
	            data = input.read();
	        }
	    }
	}
	

}
