package chap14;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class FlowLayout1 extends JFrame {
	public FlowLayout1() {
		// ���������κ��� �����̳� ����.
		Container ct = getContentPane();
		
		// �����̳ʿ� ������Ʈ�� ������������ �������� ��ġ��Ű�� ������
		//FlowLayout fl = new FlowLayout(FlowLayout.LEFT, 10, 15);
		FlowLayout fl = new FlowLayout(FlowLayout.RIGHT, 10, 15);
												// ����, ���� ����, ���� ����
		
		// �����̳ʿ� Layout ����
		ct.setLayout(fl);
		
		// 15�� ��ư ������Ʈ�� �����Ͽ� �����̳ʿ� �߰�
		for (int i = 1; i <= 15; i++) {
			ct.add(new JButton("��ư" + i));
		}
		
		setTitle("FlowLayout Test");
		setSize(500,300);
		
		// ������ â ����� ���μ��� �ݱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ȭ�鿡 ���
		setVisible(true);
	}
}

public class FlowLayoutTest1 {

	public static void main(String[] args) {
		new FlowLayout1();
	}

}
