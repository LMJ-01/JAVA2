package a0926;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ObjectRead1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner stdin = new Scanner(System.in);
		System.out.print("출력 파일명을 입력하세요 : ");
		String fileName = stdin.next();
		
		
		// 객체를 기록할 수 있는 ObjectOutputStream 객체 생성
		ObjectOutputStream oos = new ObjectOutputStream(new FileInputStream(file));
		
		// 직렬화된 객체 읽어 오기
		Object s2 = ois.readObject();
		
		// readObject() 메소드로 직렬화된 객체와 2진 데이터를 읽어서 객체 타입으로 캐스팅(형변환)한다.
		personInfo p1 = (personInfo)ois.readObject();
		personInfo p2 = (personInfo)ois.readObject();
		
		// 출력한 순서대로 입력해야 한다.
		System.out.println(s2); //1
		System.out.println("이름 : " + p1.name); //2
		System.out.println("주소 : " + p1.city);
		System.out.println("나이 : " + p1.age);
		System.out.println("-------------------");
		System.out.println("이름 : " + p2.name); //3
		System.out.println("주소 : " + p2.city);
		System.out.println("나이 : " + p2.age);
	}

}
