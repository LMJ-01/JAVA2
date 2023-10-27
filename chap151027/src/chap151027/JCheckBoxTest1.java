package chap151027;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
// ������ ������
class JCheckBox1 extends JFrame implements ItemListener {
	// �ؽ�Ʈ �ʵ带 ����.
	JTextField JCB;
	
	// ������
	public JCheckBox1() {
		JCB = new JTextField(10);
		// �����̳� ����
		Container ct = getContentPane();
	
		// ��ġ ������ ����. (FlowLayout)
		ct.setLayout(new FlowLayout());
		// üũ�ڽ� ��ü ����
		JCheckBox jc1 = new JCheckBox("JSP");
		JCheckBox jc2 = new JCheckBox("PHP");
		JCheckBox jc3 = new JCheckBox("ASP");
		JCheckBox jc4 = new JCheckBox("Servlet");
		
		ct.add(jc1);
		ct.add(jc2);
		ct.add(jc3);
		ct.add(jc4);
		ct.add(JCB);
		
		// �̺�Ʈ ������ ������
		jc1.addItemListener(this);
		jc2.addItemListener(this);
		jc3.addItemListener(this);
		jc4.addItemListener(this);
		
		
	
		// ȭ�鿡 ���̱� 500, 400
		setTitle("JCheckBox");
		setSize(250, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	// �̺�Ʈ ó�� ��ƾ �ۼ�
	@Override
	public void itemStateChanged(ItemEvent ie) {
		JCB.setText(((JCheckBox)ie.getItem()).getText());
		
	}

	
}
public class JCheckBoxTest1 {

	public static void main(String[] args) {
		new JCheckBox1();
	}

}
