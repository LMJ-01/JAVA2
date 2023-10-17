package chap15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// GUI Ŭ���� - �̺�Ʈ ���� 
class JLabel1 extends JFrame implements ActionListener{
	private JLabel result = new JLabel();
	public ImageIcon img1, img2;
	
	public JLabel1() {
		// �̹��� ����.
		img1 = new ImageIcon("image/apple.jpg");
		img2 = new ImageIcon("image/pear.jpg");
		
		// ��ư ����.
		JButton apple = new JButton("���");
		JButton pear = new JButton("��");
		
		// �����̳� ����.
		Container ct = getContentPane();
		// ��ġ ������ ����. - FlowLayout
		ct.setLayout(new FlowLayout());
		// �����̳ʿ� ��ư�� �� �߰�
		ct.add(apple);
		ct.add(pear);
		ct.add(result);
		
		// 3. ��ư�� ������ ���.
		apple.addActionListener(this);
		pear.addActionListener(this);
		// ȭ�� �����ֱ�
		setTitle("��ư�� ������ �̹��� �����ֱ�");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand() == "���") {
			result.setIcon(img1);
			result.setText("���ִ� ����Դϴ�.");
		}
		if(e.getActionCommand() == "��") {
			result.setIcon(img2);
			result.setText("���ִ� ���Դϴ�.");
		}
	}
}

// ���� Ŭ����
public class JLabelTest1 {

	public static void main(String[] args) {
		new JLabel1();
	}

}
