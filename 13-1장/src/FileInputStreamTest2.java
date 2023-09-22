/*
 *  작성일 : 2023년 9월 23일
 *  적상자 : 컴퓨터소프트웨어공학부 202095066 이명준
 *  설명 : 
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FileInputStreamTest2 {
	public static void main(String[] args) throws IOException{	
		// 파일명으로 객체 생성.
		OutputStream fos = new FileOutputStream("c.txt");
		// FileOutputStream : 파일에 바이트 스트림의 입출력 기능 제공.
		// OutputStream : 바이트 스트림의 입출력을 위한 기능 추상 클래스
		String str = "자바 프로그래밍 \n문자 스트림 바이트 스트림 \n";
		
		byte[]bt = str.getBytes();  // 문자열을 바이트로 전환

		fos.write(bt); // 파일에 쓰기(저장).		
		System.out.println("파일 생성하였습니다.");
		fos.close(); // 출력 스트림 닫기.
		}
}
