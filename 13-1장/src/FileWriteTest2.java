/*
 *  �ۼ��� : 2023�� 9�� 23��
 *  ������ : ��ǻ�ͼ���Ʈ������к� 202095066 �̸���
 *  ���� : ���ڸ� ���Ͽ� ����.(����)
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileWriteTest2 {

	public static void main(String[] args)throws IOException {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���� ���ϸ��� �Է��ϼ��� : ");
		String sfile = stdIn.next();
		
		// ���Ͽ� ������ ���ڿ� ����.
		String source = ("��� �־�� ��μ� ���������� ���\n" + "������ ����Ѵٴ� ����\n" + "����� �������� ��ħ�� �´´ٴ� ���Դϴ�.\n");
		
		// ���ϸ����� ��ü ����.
		FileWriter fw= new FileWriter(sfile);
		
		// ���ڿ��� ���Ͽ� ���.
		fw.write(source); // ��ü�� ���� a.txt ���Ͽ� source�� �ִ� ������ ���(����)
		
		// ��� ��Ʈ�� �ݱ�.
		fw.close();
		
		System.out.println("������ �����Ǿ����ϴ�.");
	}
	}