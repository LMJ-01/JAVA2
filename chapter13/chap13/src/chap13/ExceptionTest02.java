/*
 * 2���� ������ �Է� �޾� �������ϴ� ���α׷�.
 */
package chap13;

import java.util.Scanner;

public class ExceptionTest02 {
	public static void main(String[] args) {
		// TODO auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("ù ��° �� �Է� : ");
		int num1 = stdIn.nextInt();
		System.out.print("�� ��° �� �Է� : ");
		int num2 = stdIn.nextInt();
	
		try {
			System.out.println(num1 / num2); // alt shift z -> try catch block
	
		} catch (Exception e) {
			System.out.print("0���� ���� �� �����ϴ�.");
			System.out.print("�ش� ���� : " + e);
	}
	}		
}	
