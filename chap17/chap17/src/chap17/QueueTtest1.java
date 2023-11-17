package chap17;

import java.util.LinkedList;
import java.util.Scanner;

// 선입선출
public class QueueTtest1 {

	public static void main(String[] args) {
		LinkedList<String> queue = new LinkedList<String>();
		
		// 사용자로부터 4개의 과일 이름을 입력 받아 queue에 저장 -> offer
		Scanner stdIn = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			System.out.println("과일 이름을 입력하세요 : ");
			String fruits = stdIn.next();
			queue.offer(fruits);
		}
		
		// queue에 저장된 과일 리스트 출력
		System.out.println("과일 리스트<큐>" + queue);
		
		// queue에서 과일 찾기 -> indexOf()
		System.out.println("찾고 싶은 과일 이름을 입력하세요 : ");
		String f_name = stdIn.next();
		int fruits = queue.indexOf(f_name);
		
		if(fruits != -1) {
			System.out.println("큐에서 " + f_name + "의 위치는 " + fruits  + "번째입니다.");
		}
		else {
			System.out.println("큐에서 " + f_name + "가 없습니다.");
		}
		
		// queue 리스트 삭제 -> poll()
		
		System.out.println("과일 리스트<스택> 삭제");
		while(!queue.isEmpty()) {
			String obj = queue.pop();
			System.out.println("<스택>에서 pop : " + obj);
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
		
		// 사용자로부터 4개의 과일 이름을 입력 받아 stack에 저장
		Scanner stdIn = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			System.out.println("과일 이름을 입력하세요 : ");
			String fruits = stdIn.next();
			stack.push(fruits);
		}
		
		System.out.println("과일 리스트<스택>" + stack);
		
		// 스택에서 과일 찾기
		System.out.println("찾고 싶은 과일 이름을 입력하세요 : ");
		String f_name = stdIn.next();
		int fruits = stack.search(f_name);
		
		if(fruits != -1) {
			System.out.println("스택에서 " + f_name + "의 위치는 " + fruits  + "번째입니다.");
		}
		else {
			System.out.println("스택에서 " + f_name + "가 없습니다.");
		}
		
		System.out.println("과일 리스트<스택> 삭제");
		while(!stack.empty()) {
			String obj = stack.pop();
			System.out.println("<스택>에서 pop : " + obj);
		}
	}

} 
 */
