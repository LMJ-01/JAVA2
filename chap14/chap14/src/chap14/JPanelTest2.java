package chap14;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class JPanel2 extends JFrame {
	public JPanel2() {
		// ���������κ��� �����̳� ����.
		Container ct = getContentPane();
				
		// ��ġ ������
		ct.setLayout(new BorderLayout(5, 5));
		
		// �ǳ�1 ��ü ����.
		JPanel jp1 = new JPanel();
		
		// �ǳ�1�� GridLayout ��ġ ������ ����.. 5�� 1ĭ
		jp1.setLayout(new GridLayout(5, 1));
		
		// �ǳ�1�� ������ư �߰�
		jp1.add(new JRadioButton("�ڹ�"));
		jp1.add(new JRadioButton("C���"));
		jp1.add(new JRadioButton("JAVA Script"));
		jp1.add(new JRadioButton("JSP"));
		jp1.add(new JRadioButton("C#"));
		
		// �ǳ�1 ��ü ����.
		JPanel jp2 = new JPanel();
				
		// �ǳ�1�� GridLayout ��ġ ������ ����.. 5�� 1ĭ
		jp2.setLayout(new GridLayout(5, 1));
		
		// �ǳ�2�� ��ư �߰�
		jp2.add(new JButton("�ڹ�"));
		jp2.add(new JButton("C���"));
		jp2.add(new JButton("JAVA Script"));
		jp2.add(new JButton("JSP"));
		jp2.add(new JButton("C#"));
		
		// �ǳ�1 ��ü ����.
		JPanel jp3 = new JPanel();
						
		// �ǳ�1�� GridLayout ��ġ ������ ����.. 1�� 1ĭ
		jp3.setLayout(new GridLayout(1, 1));
		
		// �ǳ� 3�� ���̺� �߰�
		jp3.add(new JLabel("�����ϴ� ���α׷��� �� �����ϼ���."));
		
		ct.add(jp1, BorderLayout.WEST);
		ct.add(jp2, BorderLayout.EAST);
		ct.add(jp3, BorderLayout.NORTH);
		
		setTitle("JPanel2 Test");
		setSize(300,200);
		
		// ������ â ����� ���μ��� �ݱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ȭ�鿡 ���
		setVisible(true);
	}
}

public class JPanelTest2 {
	public static void main(String[] args) {
		new JPanel2();
	}
}
