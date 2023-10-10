package chap14;
/*
 * ���� Ŭ������ �̿��� �̺�Ʈ ó��
 */

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Event2 extends JFrame {
	// JLabel ��ü�� �Ӽ����� ���
	JLabel jl;
	
	// JButton ��ü�� �Ӽ����� 2�� ���
	JButton jb1, jb2;
	
	// ������
	public Event2() {
		// ���������κ��� �����̳� ����.
		Container ct = getContentPane();
		// ��ġ ������ ����. (FlowLayout)
		ct.setLayout(new FlowLayout());
				
		// ��ư ����.
		jb1 = new JButton("�ȳ��ϼ���.");
		jb2 = new JButton("�ູ�� �Ϸ��Դϴ�.");
				
		// ����� ����.
		jl = new JLabel("��ư�� ���� �ּ���.");
		
		// �����̳ʿ� ��ư�� ���̺� ���
		ct.add(jb1);
		ct.add(jb2);   
		ct.add(jl);
		
		// 3. �̺�Ʈ�� �޾Ƶ��� ������Ʈ�� ������ ���.
		jb1.addActionListener(new EventProcess());
		jb2.addActionListener(new EventProcess());
		
		setTitle("�̺�Ʈ �׽�Ʈ2");
		setSize(300, 200);
		
		// ������ â ����� ���μ��� �ݱ�		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		// ȭ�鿡 ���
		setVisible(true);
	}
	
	// �̺�Ʈ�� ó���� Ŭ���� �ۼ�.
	// 1. ó���� �̺�Ʈ ���� ���� -ActionEvent
	// 2. �̺�Ʈ�� ������ �̺�Ʈ ������ �������̽��� ����Ͽ� Ŭ���� �ۼ�. - ActionListener
	private class EventProcess implements ActionListener {
		// 4. ������ �������̽��� ����� �޼ҵ带 �������̵��Ͽ� �̺�Ʈ ó�� ��ƾ �ۼ�.
		@Override
		public void actionPerformed(ActionEvent e) {
			jl.setText(e.getActionCommand());
		}
	}
}

public class EventTest2 {

	public static void main(String[] args) {
		new Event2();
	}

}
