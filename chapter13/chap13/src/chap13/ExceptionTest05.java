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
			System.out.print(e + "������ �������� �ʽ��ϴ�.");
	}
		catch (IOException e) {
		System.out.print("������ �������� �ʽ��ϴ�.");
}
}
