import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3_1 {
	public static void main(String[] args) {
		File file = new File("c.txt");
		
		// FileInputStream ��ü ����.
		try {
			FileInputStream fr = new FileInputStream(file);
			
			// �� ���ھ� �б�
			int i;
			while((i = fr.read()) != -1) { // �����͸� ��� ������ -1 ��ȯ
				System.out.print((char)i);
			}
			
				fr.close();
				System.out.println("���Ϸκ��� ����Ʈ�� �о� ȭ�鿡 ���");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
