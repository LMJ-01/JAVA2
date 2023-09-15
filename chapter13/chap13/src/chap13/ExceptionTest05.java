package chap13;

import java.io.FileReader;

public class ExceptionTest05 {
	public static void main(String[] args) {
		FileReader file = new FileReader("a.txt");
		int i;
		while((i = file.read()) != -1) {
			System.out.print((char)i);
		}
		file.close();
	}	catch (FileNotFoundExeption e) {
			System.out.print(e + "파일이 존재하지 않습니다.");
	}
		catch (IOException e) {
		System.out.print("파일이 존재하지 않습니다.");
}
}
