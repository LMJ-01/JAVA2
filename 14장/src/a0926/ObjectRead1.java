package a0926;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ObjectRead1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner stdin = new Scanner(System.in);
		System.out.print("��� ���ϸ��� �Է��ϼ��� : ");
		String fileName = stdin.next();
		
		
		// ��ü�� ����� �� �ִ� ObjectOutputStream ��ü ����
		ObjectOutputStream oos = new ObjectOutputStream(new FileInputStream(file));
		
		// ����ȭ�� ��ü �о� ����
		Object s2 = ois.readObject();
		
		// readObject() �޼ҵ�� ����ȭ�� ��ü�� 2�� �����͸� �о ��ü Ÿ������ ĳ����(����ȯ)�Ѵ�.
		personInfo p1 = (personInfo)ois.readObject();
		personInfo p2 = (personInfo)ois.readObject();
		
		// ����� ������� �Է��ؾ� �Ѵ�.
		System.out.println(s2); //1
		System.out.println("�̸� : " + p1.name); //2
		System.out.println("�ּ� : " + p1.city);
		System.out.println("���� : " + p1.age);
		System.out.println("-------------------");
		System.out.println("�̸� : " + p2.name); //3
		System.out.println("�ּ� : " + p2.city);
		System.out.println("���� : " + p2.age);
	}

}
