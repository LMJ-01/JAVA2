package chap14;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

class FirstFrame2 extends JFrame { // JFrame �� ��ӹ޾� Ŭ���� ����.
	public FirstFrame2() {
		// ���������κ��� �����̳�(���) ����.
		Container ct = getContentPane();
		
		// ��ư ������Ʈ ����.
		JButton jb = new JButton("�׽�Ʈ ��ư2");
		
		// �����̳ʿ� ��ư �߰�
		ct.add(jb);
		
		// ������ ���� ����
		setTitle("�� ���� GUI ���α׷� - JFrame ���");
		
		// ������ ũ��
		setSize(400, 300);
				
		// �������� ȭ�鿡 ���
		setVisible(true);
	}
}
public class FrameTest2 {
	public static void main(String[] args) {
		// Ŭ���� ȣ��
		new FirstFrame2();
	}

}
