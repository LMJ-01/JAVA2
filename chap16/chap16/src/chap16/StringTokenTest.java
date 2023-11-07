package chap16;

import java.util.StringTokenizer;

public class StringTokenTest {

	public static void main(String[] args) {
		
		String s1 = "name Leemj gender M age 23";
		String s2 = "name,Leemj,gender,M,age,23";
		String s3 = "name/Leemj/gender/M/age/23";
		
		System.out.println(":: ��ĭ�� �������� �и� ::");
		
		StringTokenizer st1 = new StringTokenizer(s1);
		
		// ��ū�� ������ true, ������ false ��ȯ
		while(st1.hasMoreElements()) {
			String first = st1.nextToken(); // ���� ��ū�� �������� ���ڿ��� ��ȯ 
			String second = st1.nextToken();
			
			System.out.println(first + "\t" + second);
		}
		
		System.out.println(":: ,�� �������� �и� ::");
		
		StringTokenizer st2 = new StringTokenizer(s2, ","); // �и��� =>  ��ü ����
		 
		// ��ū�� ������ true, ������ false ��ȯ
		while(st2.hasMoreElements()) {
			String first = st2.nextToken(); // ���� ��ū�� �������� ���ڿ��� ��ȯ 
			String second = st2.nextToken();
					
			System.out.println(first + "\t" + second);
		}
		
		System.out.println(":: /�� �������� �и� ::");
		
		StringTokenizer st3 = new StringTokenizer(s3, "/");
		
		// ��ū�� ������ true, ������ false ��ȯ
		while(st3.hasMoreElements()) {
			String first = st3.nextToken(); // ���� ��ū�� �������� ���ڿ��� ��ȯ 
			String second = st3.nextToken();
							
			System.out.println(first + "\t" + second);
		}
	}

}
