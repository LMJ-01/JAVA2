package chap14;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

// Ŭ���� ����.
class FirstFrame1 {
	// ������
	public FirstFrame1() {
		// ������ ��ü ����
		JFrame jf = new JFrame("ù ��° GUI ���α׷�");
		
		// ���������κ��� �����̳�(���) ����.
		Container ct = jf.getContentPane();
		
		// ��ư ������Ʈ ����.
		JButton jb = new JButton("�׽�Ʈ ��ư");
		
		// �����̳ʿ� ��ư �߰�
		ct.add(jb);
		
		// ������ ũ��
		jf.setSize(400, 300);
		
		// �������� ȭ�鿡 ���
		jf.setVisible(true);
	}
}

public class FrameTest1 {

	public static void main(String[] args) {
		// Ŭ���� ȣ��
		new FirstFrame1();
	}

}
