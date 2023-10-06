package chap14;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

class BorderLayout1 extends JFrame {
	public BorderLayout1() {
		// ���������κ��� �����̳� ����.
		Container ct = getContentPane();
		
		// BorderLayout ��ġ ������ ��ü ����.
		BorderLayout bl = new BorderLayout(10, 10);
		
		// �����̳ʿ� ���̾ƿ� ����.
		ct.setLayout(bl);
		
		// 5���� ��ư�� ��ġ
		ct.add(new JButton("������ ��ư"), BorderLayout.EAST);
		ct.add(new JButton("���� ��ư"), BorderLayout.WEST);
		ct.add(new JButton("���� ��ư"), BorderLayout.NORTH);
		ct.add(new JButton("�Ʒ��� ��ư"), BorderLayout.SOUTH);
		ct.add(new JButton("�߾��� ��ư"), BorderLayout.CENTER);
		
		setTitle("BorderLayout Test");
		setSize(400,300);
		
		// ������ â ����� ���μ��� �ݱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ȭ�鿡 ���
		setVisible(true);
	}
}

public class BorderLayoutTest1 {

	public static void main(String[] args) {
		new BorderLayout1();
	}

}
