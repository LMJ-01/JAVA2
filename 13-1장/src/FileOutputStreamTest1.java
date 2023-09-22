package src;

/*
 *  작성일 : 2023년 9월 23일
 *  적상자 : 컴퓨터소프트웨어공학부 202095066 이명준
 *  설명 : 바이트 단위
 */


import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamTest1 {
	public static void main(String[] args)throws IOException {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("저장 파일명을 입력하세요 : ");
		String sfile = stdIn.next();
		
		// 파일명으로 객체 생성.
		FileOutputStream fos = new FileOutputStream(sfile);
		
		int i;
		for(i =1; i <= 260; i++) {
			fos.write(i); // 파일에 내용 쓰기.(저장)
		}
		fos.close(); // 출력 스트림 닫기.
		System.out.println(sfile + "파일명으로 바이트 파일을 생성하였습니다.");
	}
		
}
