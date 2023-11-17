package chap17;

import java.util.LinkedList;
import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {
		// TreeSet ��ü ����
		TreeSet<Integer> num1 = new TreeSet<Integer>();
		TreeSet<Integer> num2 = new TreeSet<Integer>();
		
		int i;
		for (i = 4; i >= 0; i--) {
			num1.add(i);
			num2.add(i*2);
			
		}
		
		// ���� ������ ������� �׻� ���ĵǾ� ��µȴ�.
		System.out.println("num1 ������ ����" + num1);
		System.out.println("num2 ������ ����" + num2);
		
		TreeSet<Integer> union = new TreeSet<Integer>(num1);
		TreeSet<Integer> itersection = new TreeSet<Integer>(num1);
		TreeSet<Integer> difference = new TreeSet<Integer>(num1);
		
		union.addAll(num2); // ������
		itersection.retainAll(num2); // ������
		difference.removeAll(num2); // ������
		
		System.out.println("������" + union);  // �ߺ��� ���� ������� �ʴ´�.
		System.out.println("������" + itersection);
		System.out.println("������" + difference);
		
		// LinkedList ��ü ����
		LinkedList<Integer> num3 = new LinkedList<Integer>();
		LinkedList<Integer> num4 = new LinkedList<Integer>();
		
		for (i = 4; i >= 0; i--) {
			num3.add(i);
			num4.add(i*2);
			
		}
		
		// LinkedList ������ �״�� ���
		System.out.println("num3 ������ ����" + num3);
		System.out.println("num4 ������ ����" + num4);
		
		LinkedList<Integer> union1 = new LinkedList<Integer>(num3);
		LinkedList<Integer> itersection1 = new LinkedList<Integer>(num3);
		LinkedList<Integer> difference1 = new LinkedList<Integer>(num3);
		
		union1.addAll(num4); // ������
		itersection1.retainAll(num4); // ������
		difference1.removeAll(num4); // ������
		
		System.out.println("������" + union1);  // �ߺ��� �� ��µȴ�.
		System.out.println("������" + itersection1);
		System.out.println("������" + difference1);
	}

}
