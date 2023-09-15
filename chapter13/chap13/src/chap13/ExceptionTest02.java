/*
 * 2개의 정수를 입력 받아 나눗셈하는 프로그램.
 */
package chap13;

import java.util.Scanner;

public class ExceptionTest02 {
	public static void main(String[] args) {
		// TODO auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("첫 번째 수 입력 : ");
		int num1 = stdIn.nextInt();
		System.out.print("두 번째 수 입력 : ");
		int num2 = stdIn.nextInt();
	
		try {
			System.out.println(num1 / num2); // alt shift z -> try catch block
	
		} catch (Exception e) {
			System.out.print("0으로 나눌 수 없습니다.");
			System.out.print("해당 예외 : " + e);
	}
	}		
}	
