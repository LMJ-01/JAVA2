import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3_1 {
	public static void main(String[] args) {
		File file = new File("c.txt");
		
		// FileInputStream 객체 생성.
		try {
			FileInputStream fr = new FileInputStream(file);
			
			// 한 문자씩 읽기
			int i;
			while((i = fr.read()) != -1) { // 데이터를 모두 읽으면 -1 반환
				System.out.print((char)i);
			}
			
				fr.close();
				System.out.println("파일로부터 바이트를 읽어 화면에 출력");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
