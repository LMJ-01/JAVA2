package chap17;

import java.util.LinkedList;
import java.util.Scanner;

// ���Լ���
public class QueueTtest1 {

	public static void main(String[] args) {
		LinkedList<String> queue = new LinkedList<String>();
		
		// ����ڷκ��� 4���� ���� �̸��� �Է� �޾� queue�� ���� -> offer
		Scanner stdIn = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			System.out.println("���� �̸��� �Է��ϼ��� : ");
			String fruits = stdIn.next();
			queue.offer(fruits);
		}
		
		// queue�� ����� ���� ����Ʈ ���
		System.out.println("���� ����Ʈ<ť>" + queue);
		
		// queue���� ���� ã�� -> indexOf()
		System.out.println("ã�� ���� ���� �̸��� �Է��ϼ��� : ");
		String f_name = stdIn.next();
		int fruits = queue.indexOf(f_name);
		
		if(fruits != -1) {
			System.out.println("ť���� " + f_name + "�� ��ġ�� " + fruits  + "��°�Դϴ�.");
		}
		else {
			System.out.println("ť���� " + f_name + "�� �����ϴ�.");
		}
		
		// queue ����Ʈ ���� -> poll()
		
		System.out.println("���� ����Ʈ<����> ����");
		while(!queue.isEmpty()) {
			String obj = queue.pop();
			System.out.println("<����>���� pop : " + obj);
		}
	}

}

/*
 *package chap17;

import java.util.Scanner;
import java.util.Stack;

public class StackTest1 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		// ����ڷκ��� 4���� ���� �̸��� �Է� �޾� stack�� ����
		Scanner stdIn = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			System.out.println("���� �̸��� �Է��ϼ��� : ");
			String fruits = stdIn.next();
			stack.push(fruits);
		}
		
		System.out.println("���� ����Ʈ<����>" + stack);
		
		// ���ÿ��� ���� ã��
		System.out.println("ã�� ���� ���� �̸��� �Է��ϼ��� : ");
		String f_name = stdIn.next();
		int fruits = stack.search(f_name);
		
		if(fruits != -1) {
			System.out.println("���ÿ��� " + f_name + "�� ��ġ�� " + fruits  + "��°�Դϴ�.");
		}
		else {
			System.out.println("���ÿ��� " + f_name + "�� �����ϴ�.");
		}
		
		System.out.println("���� ����Ʈ<����> ����");
		while(!stack.empty()) {
			String obj = stack.pop();
			System.out.println("<����>���� pop : " + obj);
		}
	}

} 
 */
