/*
 *  �ۼ��� : 2023�� 9�� 23��
 *  ������ : ��ǻ�ͼ���Ʈ������к� 202095066 �̸���
 *  ���� : 
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FileInputStreamTest2 {
	public static void main(String[] args) throws IOException{	
		// ���ϸ����� ��ü ����.
		OutputStream fos = new FileOutputStream("c.txt");
		// FileOutputStream : ���Ͽ� ����Ʈ ��Ʈ���� ����� ��� ����.
		// OutputStream : ����Ʈ ��Ʈ���� ������� ���� ��� �߻� Ŭ����
		String str = "�ڹ� ���α׷��� \n���� ��Ʈ�� ����Ʈ ��Ʈ�� \n";
		
		byte[]bt = str.getBytes();  // ���ڿ��� ����Ʈ�� ��ȯ

		fos.write(bt); // ���Ͽ� ����(����).		
		System.out.println("���� �����Ͽ����ϴ�.");
		fos.close(); // ��� ��Ʈ�� �ݱ�.
		}
}
