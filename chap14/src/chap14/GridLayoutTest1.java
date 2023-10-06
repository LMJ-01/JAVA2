package chap14;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class GridLayout1 extends JFrame {
	public GridLayout1() {
		
		// ���������κ��� �����̳� ����.
		Container ct = getContentPane();
		
		// GridLayout ��ġ ������ ��ü ����.
		GridLayout gl = new GridLayout(4, 5, 10, 10);
									// 4�� 5��
		// �����̳ʿ� ���̾ƿ� ����.
		ct.setLayout(gl);
		
		// 20���� ��ư ������Ʈ�� �����Ͽ� �����̳ʿ� �߰�.
		for (int i = 1; i <= 20; i++) {
			ct.add(new JButton("��ư" + i));
		}
		
		setTitle("GridLayout Test");
		setSize(500,500);
		
		// ������ â ����� ���μ��� �ݱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ȭ�鿡 ���
		setVisible(true);
	}
}

public class GridLayoutTest1 {

	public static void main(String[] args) {
		new GridLayout1();
	}

}
