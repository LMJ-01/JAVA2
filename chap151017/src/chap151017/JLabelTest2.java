package chap151017;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//예제 14.19 참조 EventTest2
// GUI 클래스 - 이벤트 포함 
class JLabel2 extends JFrame{
	private JLabel result = new JLabel();
	public ImageIcon img1, img2;
	
	public JLabel2() {
		// 이미지 생성.
		img1 = new ImageIcon("image/apple.jpg");
		img2 = new ImageIcon("image/pear.jpg");
		
		// 버튼 생성.
		JButton apple = new JButton("사과");
		JButton pear = new JButton("배");
		
		// 컨테이너 생성.
		Container ct = getContentPane();
		// 배치 관리자 설정. - FlowLayout
		ct.setLayout(new FlowLayout());
		// 컨테이너에 버튼과 라벨 추가
		ct.add(apple);
		ct.add(pear);
		ct.add(result);
		
		// 3. 버튼에 리스너 등록.
		apple.addActionListener(new EventProcess());
		pear.addActionListener(new EventProcess());
		// 화면 보여주기
		setTitle("버튼을 누르면 이미지 보여주기");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	private class EventProcess implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getActionCommand() == "사과") {
				result.setIcon(img1);
				result.setText("맛있는 사과입니다.");
			}
			if(e.getActionCommand() == "배") {
				result.setIcon(img2);
				result.setText("맛있는 배입니다.");
			}
		}
	}
	
}

// 메인 클래스
public class JLabelTest2 {

	public static void main(String[] args) {
		new JLabel2();
	}

}