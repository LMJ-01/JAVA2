package chap13;

import java.io.FileReader;
import java.io.FileNotFoundException;
import jave.io.IOException;

public class ExceptionTest06 {
	
	public static void main(String[] args) throws Exception, IOException{
		FileReader file = new FileReader("a.txt");
		int i;
		while((i = file.read()) != -1) {
			System.out.print((char)i);
		}
		file.close();
	}
}
