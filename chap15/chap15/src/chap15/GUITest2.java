package chap15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
class GUI2 extends JFrame implements ActionListener{
	// 속성으로 텍스트 에어리어와 텍스트 필드를 선언.
	private JTextArea contents;
	private JTextField f_name;
	// 생성자.
	public GUI2() {
		// 여러줄 텍스트 객체 생성.  - 글 내용 출력
		contents = new JTextArea(10, 20);
		// 여러줄 텍스트 객체 생성.  - 파일 저장명 입력
		f_name = new JTextField("파일 이름을 입력하세요.", 20);
		
		// 버튼 객체 생성
		JButton jb = new JButton("파일 불러오기");
		// 텍스트 에어리어 수정 불가.
		contents.setEditable(false);
		
		// 컨테이너 생성
		Container ct = getContentPane();
				
		// 배치 관리자 설정. (FlowLayout)
		ct.setLayout(new FlowLayout());
		
		// 판넬 객체 생성.
		JPanel pl = new JPanel();
		
		// 판넬에 텍스트 필드 추가
		pl.add(f_name);
				
		// 판넬에 버튼 추가
		pl.add(jb);

		// GUI1 과 위 아래 순서 차이
		// 컨테이너에 판넬추가
		ct.add(pl);
		
		// 컨테이너에 텍스트 에어리어 추가
		ct.add(contents);
		
		// 3. 이벤트 받아들일 버튼에 리스너 등록.
		jb.addActionListener(this);
		
		// 화면에 보이기 500, 400
		setTitle("GUI2");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	// 4. 이벤트 처리
	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			// 파일 이름으로 입력 객체 생성.
			String s = f_name.getText();
			FileInputStream fis = new FileInputStream(s);
			DataInputStream dis = new DataInputStream(fis);
			
			// 파일의 내용을 읽어와서 텍스트 에어리어의 내용으로 설정.
			contents.setText(dis.readUTF());
			// 파일 닫기
			fis.close();
			System.out.print(s + "파일을 읽어 왔습니다.");
		}
		catch(Exception e) {
			System.out.print("파일이 존재하지 않습니다..");
		}
		
	}
}
public class GUITest2 {

	public static void main(String[] args) {
		new GUI2();
	}

}
