package a0926;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

//이 클래스를 직렬화할 것임을 지정.
class personInfo implements Serializable{
String name;
String city;
int age;

// 생성자 
	public void PersonInfo(String name, String city, int age) {
		this.name = name;
		this.city = city;
		this.age = age;
	}
}

public class PersonInfo {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("출력 파일명을 입력하세요 : ");
		String fileName = stdin.next();
				
		String s1 = "*** 고객 정보 ***";
		
		// 직렬화된 객체를 2개 생성.
		PersonInfo p1 = new PersonInfo("이명준" , "제주", 23);
		PersonInfo p2 = new PersonInfo("홍길동" , "제주", 23);
		
		// 직렬화된 객체를 2진수로 파일을 지정.
		// 객체를 기록할 수 있는 ObjectOutputStream 객체 생성
		ObjectOutputStream oos = new ObjectOutputStream(new FileInputStream(file));
		
		// 직렬화된 객체를 파일에 2진수로 기록한다.
		oos.writeObject(s1);
		oos.writeObject(p1);
		oos.writeObject(p2);
		
		oos.close();
		System.out.println(fileName + "파일명으로 객체 파일을 생성하였습니다.");
	}
}
