package chap151017;



import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// 예제 14.10 참조 EventTest3
class GUI1_1 extends JFrame {
	// 속성으로 텍스트 에어리어와 텍스트 필드를 선언.
	private JTextArea contents;
	private JTextField f_name;
	
	// 생성자
	public GUI1_1() {
		// 여러줄 텍스트 객체 생성.  - 글 내용 입력
		contents = new JTextArea("파일의 내용을 입력하세요.", 10, 20);
		// 여러줄 텍스트 객체 생성.  - 글 내용 입력
		f_name = new JTextField("파일의 내용을 입력하세요.", 20);
		// 버튼 객체 생성
		JButton jb = new JButton("파일로 저장");
		
		// 리스너 등록
	    jb.addActionListener(new EventClass1(contents, f_name));
				
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
		
		// 컨테이너에 텍스트 에어리어 추가
		ct.add(contents);
						
		// 컨테이너에 판넬추가
		ct.add(pl);
		
		// 화면에 보이기 500, 400
		setTitle("GUI1_1");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
// 별도의 이벤트 처리 클래스 생성
class EventClass1 implements ActionListener {
	private JTextArea contents;
	private JTextField f_name;
	// JTextArea JTextField 객체 공유
	public EventClass1(JTextArea contents,JTextField f_name) {
		this.contents = contents;
		this.f_name = f_name;
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			// 입출력을 위한 예외처리
			// 파일 이름으로 출력 객체 생성.
			String s = f_name.getText();
			FileOutputStream fos = new FileOutputStream(s);
			DataOutputStream dos = new DataOutputStream(fos);
			
			// 텍스트 에어리어의 내용을 파일로 출력
			dos.writeUTF(contents.getText());
			// 파일 닫기
			fos.close();
			System.out.print(s + "파일이 생성되었습니다.");
			
		}
		catch(Exception e) {
			
		}
	}
}

public class GUITest1_1 {

	public static void main(String[] args) {
		new GUI1_1();
	}

}
