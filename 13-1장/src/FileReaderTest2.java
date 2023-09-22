/*
 *  �ۼ��� : 2023�� 9�� 23��
 *  ������ : ��ǻ�ͼ���Ʈ������к� 202095066 �̸���
 *  ���� : 
 */
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderTest2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		try {
			System.out.print("���ϸ��� �Է��ϼ��� : ");
			String sfile = stdIn.next(); // ���ڿ��� �Էµ� ���ϸ� ����.
		
			// �о���� ���ϸ����� ��ü ����.
			FileReader fr = FileReader(sfile);
		
			// �� ���ھ� �б�
			int i;
			while((i = fr.read()) != -1 ){  // �����͸� ��� ������ -1 ��ȯ
				System.out.print((char)i);
			}
			fr.close(); // ��Ʈ�� �ݱ�.
		
		} catch (FileNotFoundException e) {  // ����ó���� �ʼ�!!!
		System.out.println("������ �����ϴ�.");
		
		} catch (EOFException e) {
			System.out.println("�о� ���� ������ �����ϴ�.");
		}
	}
}
