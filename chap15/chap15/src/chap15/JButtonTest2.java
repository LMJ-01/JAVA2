package chap15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

// GUI Ŭ����
class JButton2 extends JFrame implements ActionListener {
	JTextField jtf;
	public JButton2() {
		jtf = new JTextField(10);
		// �̹��� ������ ��ü ����.
		ImageIcon apple = new ImageIcon("image/apple.jpg");
		ImageIcon banana = new ImageIcon("image/banana.jpg");
		ImageIcon persimmom = new ImageIcon("image/persimmom.jpg");
		ImageIcon pear = new ImageIcon("image/pear.jpg");
		ImageIcon grape = new ImageIcon("image/grape.jpg");
		
		// ��ư ��ü ����
		JButton jb1 = new JButton("���", apple);
		JButton jb2 = new JButton("�ٳ���", banana);
		JButton jb3 = new JButton("��", persimmom);
		JButton jb4 = new JButton("��", pear);
		JButton jb5 = new JButton("����", grape);
		
		// �����̳� ����
		Container ct = getContentPane();
				
		// ��ġ ������ ����. (GridLayout)
		ct.setLayout(new GridLayout(3, 2));
		
		// �����̳ʿ� ��ư �߰�
		ct.add(jb1);
		ct.add(jb2);
		ct.add(jb3);
		ct.add(jb4);
		ct.add(jb5);
		ct.add(jtf);
		// 3. ��ư�� ������ ���.
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		
		// ȭ�鿡 ���̱� 500, 400
		setTitle("JButton2");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		jtf.setText(e.getActionCommand());
	}
}

// ���� Ŭ����
public class JButtonTest2 {

	public static void main(String[] args) {
		new JButton2();
	}

}
