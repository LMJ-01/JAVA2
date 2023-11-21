package chap17;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest01 {

	public static void main(String[] args) {
		HashMap<String, String> dict = new HashMap<String, String>();
		
		// 3���� (k, v)�� �̷���� ���� dict�� ����
		dict.put("���", "apple");
		dict.put("����", "strawberry");
		dict.put("����", "grape");
		
		// ����ڷκ��� �ѱ� �ܾ� �Է� �޾� ���� �ܾ� �˻�
		Scanner stdIn = new Scanner(System.in);
		while(true)
		{
			System.out.println("�˰� ���� ���� �̸��� �Է��ϼ���.(0�� ����)");
			String kor = stdIn.next();
			
			// 0 �Է� �� ���α׷� ����
			if(kor.equals("0")) {
				System.out.println("���� ����");
				break;
			}
			
			// �ؽøʿ��� Ű kor�� �ش��ϴ� �� eng �˻�
			String eng = dict.get(kor);
			if(eng == null) {
				System.out.println(kor + "�� ���� �ܾ� �Դϴ�.");
			}
			else {
				System.out.println(eng);
			}
		}
	}

}
