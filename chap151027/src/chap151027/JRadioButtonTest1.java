package chap151027;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class JRadioButton1 extends JFrame implements ActionListener{
	JLabel JB;
	JCheckBox[] JC = new JCheckBox[5];
	String[] hobby = {"걷기", "등산", "수영", "게임", "공부"};
	
	JRadioButton[] JR = new JRadioButton[5];
	String[] age = {"10대", "20대", "30대", "40대", "50대"};
	
	public JRadioButton1() {
		JB = new JLabel();
		
		// 컨테이너 생성
		Container ct = getContentPane();
			
		// 배치 관리자 설정. (GridLayout)
		ct.setLayout(new GridLayout(3,1));
		
		JLabel JB1 = new JLabel("당신의 취미는?");
		JLabel JB2 = new JLabel("당신의 나이는?");
		// 나이를 나타내는 체크박스 버튼을 그룹으로 설정
		ButtonGroup BG = new ButtonGroup();
		
		JPanel hobbypanel = new JPanel();
		JPanel agepanel = new JPanel();
		
		for(int i = 0; i < 5; i++) {
			JC[i] = new JCheckBox(hobby[i]);
			JR[i] = new JRadioButton(age[i]);
			
			hobbypanel.add(JC[i]);
			agepanel.add(JR[i]);
			
			JR[i].addActionListener(this);
			BG.add(JR[i]);
		}
		
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		
		jp1.add(JB1);
		jp2.add(JB2);
		
		jp1.add(hobbypanel);
		jp2.add(agepanel);
		jp3.add(JB);
		
		ct.add(jp1);
		ct.add(jp2);
		ct.add(jp3);
		
		
		// 화면에 보이기 
		setTitle("JRadioButton");
		setSize(350, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String s = "당신의 취미 : ";
		for(int i = 0; i < 5; i++) {
			if(JC[i].isSelected()==true)
				s = s + hobby[i] + " ";
		}
		s = s + "당신의 나이 : ";
		JB.setText(s + ae.getActionCommand());
		
	}
	
}

public class JRadioButtonTest1 {

	public static void main(String[] args) {
		new JRadioButton1();

	}

}
