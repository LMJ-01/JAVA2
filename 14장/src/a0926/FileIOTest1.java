package a0926;

import java.io.*;

public class FileIOTest1 {

	public static void main(String[] args) throws Exception {
		String source = "Have a good day. Have a nice day! Have good? Have fun?";
		char intxt[] = new char[source.length()];
		//���ڿ� ũ���� ���ڹ迭 ����.
		source.(0, source.length(), intxt, 0);
		// �Է¹迭�� intxt ���� �迭�� ����
		
		FileWriter fw = new FileWriter("temp.txt");
		fw.write(intxt); // ���� �迭�� ������ ���Ͽ� ���
		
		fw.close();
	}

}
