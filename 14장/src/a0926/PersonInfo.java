package a0926;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

//�� Ŭ������ ����ȭ�� ������ ����.
class personInfo implements Serializable{
String name;
String city;
int age;

// ������ 
	public void PersonInfo(String name, String city, int age) {
		this.name = name;
		this.city = city;
		this.age = age;
	}
}

public class PersonInfo {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("��� ���ϸ��� �Է��ϼ��� : ");
		String fileName = stdin.next();
				
		String s1 = "*** �� ���� ***";
		
		// ����ȭ�� ��ü�� 2�� ����.
		PersonInfo p1 = new PersonInfo("�̸���" , "����", 23);
		PersonInfo p2 = new PersonInfo("ȫ�浿" , "����", 23);
		
		// ����ȭ�� ��ü�� 2������ ������ ����.
		// ��ü�� ����� �� �ִ� ObjectOutputStream ��ü ����
		ObjectOutputStream oos = new ObjectOutputStream(new FileInputStream(file));
		
		// ����ȭ�� ��ü�� ���Ͽ� 2������ ����Ѵ�.
		oos.writeObject(s1);
		oos.writeObject(p1);
		oos.writeObject(p2);
		
		oos.close();
		System.out.println(fileName + "���ϸ����� ��ü ������ �����Ͽ����ϴ�.");
	}
}
