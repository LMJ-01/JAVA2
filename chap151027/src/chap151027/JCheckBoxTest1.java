package chap151027;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
// 아이템 리스너
class JCheckBox1 extends JFrame implements ItemListener {
	// 텍스트 필드를 선언.
	JTextField JCB;
	
	// 생성자
	public JCheckBox1() {
		JCB = new JTextField(10);
		// 컨테이너 생성
		Container ct = getContentPane();
	
		// 배치 관리자 설정. (FlowLayout)
		ct.setLayout(new FlowLayout());
		// 체크박스 객체 생성
		JCheckBox jc1 = new JCheckBox("JSP");
		JCheckBox jc2 = new JCheckBox("PHP");
		JCheckBox jc3 = new JCheckBox("ASP");
		JCheckBox jc4 = new JCheckBox("Servlet");
		
		ct.add(jc1);
		ct.add(jc2);
		ct.add(jc3);
		ct.add(jc4);
		ct.add(JCB);
		
		// 이벤트 아이템 리스너
		jc1.addItemListener(this);
		jc2.addItemListener(this);
		jc3.addItemListener(this);
		jc4.addItemListener(this);
		
		
	
		// 화면에 보이기 500, 400
		setTitle("JCheckBox");
		setSize(250, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	// 이벤트 처리 루틴 작성
	@Override
	public void itemStateChanged(ItemEvent ie) {
		JCB.setText(((JCheckBox)ie.getItem()).getText());
		
	}

	
}
public class JCheckBoxTest1 {

	public static void main(String[] args) {
		new JCheckBox1();
	}

}
