package chap15;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

// GUI Ŭ����
class JButton1 extends JFrame {
	public JButton1() {
		// �̹��� ������ ��ü ����.
		ImageIcon korea = new ImageIcon("image/korea1.gif");
		ImageIcon usa = new ImageIcon("image/usa.gif");
		ImageIcon germany = new ImageIcon("image/germany.gif");
		
		// ��ư ��ü ����
		JButton nat = new JButton(korea);  // �⺻ ��ư �̹����� �±ر�
		nat.setPressedIcon(usa);  // ��ư�� ������ �̱� ����
		nat.setRolloverIcon(germany);  // ��ư�� ���콺�� �ø��� ���� ����
		
		// �����̳� ����
		Container ct = getContentPane();
		
		// ��ġ ������ ����. (FlowLayout)
		ct.setLayout(new FlowLayout());
		
		// �����̳ʿ� ��ư �߰�
		ct.add(nat);
		
		// ȭ�鿡 ���̱� 500, 400
		setTitle("JButton");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}


// ���� Ŭ����
public class JButtonTest1 {

	public static void main(String[] args) {
		new JButton1();
	}

}
