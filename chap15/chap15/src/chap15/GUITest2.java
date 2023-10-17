package chap15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
class GUI2 extends JFrame implements ActionListener{
	// �Ӽ����� �ؽ�Ʈ ������ �ؽ�Ʈ �ʵ带 ����.
	private JTextArea contents;
	private JTextField f_name;
	// ������.
	public GUI2() {
		// ������ �ؽ�Ʈ ��ü ����.  - �� ���� ���
		contents = new JTextArea(10, 20);
		// ������ �ؽ�Ʈ ��ü ����.  - ���� ����� �Է�
		f_name = new JTextField("���� �̸��� �Է��ϼ���.", 20);
		
		// ��ư ��ü ����
		JButton jb = new JButton("���� �ҷ�����");
		// �ؽ�Ʈ ����� ���� �Ұ�.
		contents.setEditable(false);
		
		// �����̳� ����
		Container ct = getContentPane();
				
		// ��ġ ������ ����. (FlowLayout)
		ct.setLayout(new FlowLayout());
		
		// �ǳ� ��ü ����.
		JPanel pl = new JPanel();
		
		// �ǳڿ� �ؽ�Ʈ �ʵ� �߰�
		pl.add(f_name);
				
		// �ǳڿ� ��ư �߰�
		pl.add(jb);

		// GUI1 �� �� �Ʒ� ���� ����
		// �����̳ʿ� �ǳ��߰�
		ct.add(pl);
		
		// �����̳ʿ� �ؽ�Ʈ ����� �߰�
		ct.add(contents);
		
		// 3. �̺�Ʈ �޾Ƶ��� ��ư�� ������ ���.
		jb.addActionListener(this);
		
		// ȭ�鿡 ���̱� 500, 400
		setTitle("GUI2");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	// 4. �̺�Ʈ ó��
	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			// ���� �̸����� �Է� ��ü ����.
			String s = f_name.getText();
			FileInputStream fis = new FileInputStream(s);
			DataInputStream dis = new DataInputStream(fis);
			
			// ������ ������ �о�ͼ� �ؽ�Ʈ ������� �������� ����.
			contents.setText(dis.readUTF());
			// ���� �ݱ�
			fis.close();
			System.out.print(s + "������ �о� �Խ��ϴ�.");
		}
		catch(Exception e) {
			System.out.print("������ �������� �ʽ��ϴ�..");
		}
		
	}
}
public class GUITest2 {

	public static void main(String[] args) {
		new GUI2();
	}

}
