package chap14;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

class JPanel1 extends JFrame {
	public JPanel1() {
		// ���������κ��� �����̳� ����.
		Container ct = getContentPane();
		
		// ��ġ ������
		ct.setLayout(new FlowLayout());
		
		// �����̳ʿ� ������Ʈ �߰�(���)
		ct.add(new JRadioButton("�ڹ�"));
		ct.add(new JRadioButton("C���"));
		ct.add(new JRadioButton("JAVA Script"));
		ct.add(new JRadioButton("JSP"));
		ct.add(new JRadioButton("C#"));
		
		ct.add(new JButton("�ڹ�"));
		ct.add(new JButton("C���"));
		ct.add(new JButton("JAVA Script"));
		ct.add(new JButton("JSP"));
		ct.add(new JButton("C#"));
		
		setTitle("JPanel Test");
		setSize(300,200);
		
		// ������ â ����� ���μ��� �ݱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ȭ�鿡 ���
		setVisible(true);
		
	}
}

public class JPanelTest1 {

	public static void main(String[] args) {
		new JPanel1();
	}

}
