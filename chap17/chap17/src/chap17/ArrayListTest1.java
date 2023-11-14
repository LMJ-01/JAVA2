package chap17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTest1 {

	public static void main(String[] args) {

		// ���ڿ� �迭 ����
		String[] name = {"kim", "lee", "park", "jung", "oh"};
		
		// ���ڿ��� �迭�� �̿��Ͽ� ����Ʈ ��ü(���׸�) ����
		ArrayList<String> lname = new ArrayList<String>(Arrays.asList(name));
		
		System.out.println("�ʱ� �� : " + lname);
		
		// ����Ʈ ���� "ha" �߰�
		lname.add("ha");
		System.out.println("ha �߰� �� ����Ʈ �� : " + lname);
		
		// 0������ '��' ����
		lname.set(0, "��");
		
		// 3������ '��' �߰�
		lname.add(3, "��");  // �ε����� �ڵ����� ������
		
		System.out.println("�� ����, �� �߰� �� ����Ʈ �� : " + lname);
		
		// ������ ���ġ -> Collections Ŭ������ �޼ҵ� �̿�.
		Collections.shuffle(lname);
		System.out.println("shuffle() �޼ҵ� ����  ����Ʈ �� : " + lname);
		
		// ���� -> sort()
		Collections.sort(lname);
		System.out.println("sort() �޼ҵ� ����  ����Ʈ �� : " + lname);
		
		// 5��° �� ��� => get()
		System.out.println("5��° �� : " + lname.get(4));
		
		// ����Ʈ�� ��� ��Ҹ� '��'���� ä��� -> fill()
		Collections.fill(lname, "��");
		System.out.println("��� ��Ҹ� \"��\"���� ���� : " + lname);
	}

}
