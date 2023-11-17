package chap17;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		LinkedList<Integer> llist = new LinkedList<Integer>();
		
		int i;
		long start, stop;
		
		start = System.currentTimeMillis();
		for(i = 0; i <= 1000000; i++) {
			alist.add(i);
		}
		stop = System.currentTimeMillis();
		
		System.out.println("ArrayList - ������ ���� �ð� : " + (stop - start));
		
		start = System.currentTimeMillis();
		for(i = 0; i <= 1000000; i++) {
			llist.add(i);
		}
		stop = System.currentTimeMillis();
		
		System.out.println("LinkedList - ������ ���� �ð� : " + (stop - start));
		
		// �߰� ����
		
		start = System.currentTimeMillis();
		for(i = 0; i <= 1000; i++) {
			alist.add(500, i);
		}
		stop = System.currentTimeMillis();
		
		System.out.println("ArrayList - �߰� ���� �ð� : " + (stop - start));
		
		start = System.currentTimeMillis();
		for(i = 0; i <= 1000; i++) {
			llist.add(500, i);
		}
		stop = System.currentTimeMillis();
		
		System.out.println("LinkedList - �߰� ���� �ð� : " + (stop - start));
	}
	
	

}
