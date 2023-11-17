package chap17;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest1 {

	public static void main(String[] args) {
		// HashSet ��ü ����
		HashSet<Integer> odd = new HashSet<Integer>();
		HashSet<Integer> even = new HashSet<Integer>();
		
		for(int i = 1; i<=10; i = i + 2) {
			odd.add(i);
			even.add(i + 1);
		}
		
		// �¿� ����� ���� ���
		System.out.println("odd ������ ���� : " + odd);
		System.out.println("even ������ ���� : " + even);
		
		boolean setChanged = odd.add(5);
		System.out.println("odd�� 5 �߰� ����? : " + setChanged);
		// false -> �ߺ��� ������� �ʴ´�.
		
		setChanged = even.add(12);
		System.out.println("even�� 12 �߰� ����? : " + setChanged);
		
		System.out.println("odd ������ ���� : " + odd);
		System.out.println("even ������ ���� : " + even);
		
		// �ִ� �ּҰ� ã��
		System.out.println("odd���� ���� ���� �� : " + Collections.min(odd));
		System.out.println("even���� ���� ū �� : " + Collections.max(even));
		
		// HashSet �� �� ��Ҹ� ���� �˻��Ͽ� �հ� ���.
		// ���������� ����� ���� Iterator ���
		Iterator<Integer> odd_it = odd.iterator();
		int sum = 0;
		
		// odd�� �ִ� ��Ҹ� ���������� �˻�
		while(odd_it.hasNext()) {
			sum = sum + odd_it.next();
		}
		
		System.out.println("odd ������ �� : " + sum);
		
		
		
		// ���������� ����� ���� Iterator ���
		Iterator<Integer> even_it = even.iterator();
		sum = 0;
				
		// even�� �ִ� ��Ҹ� ���������� �˻�
		while(even_it.hasNext()) {
			sum = sum + even_it.next();
		}
				
		System.out.println("even ������ �� : " + sum);
	}

}
