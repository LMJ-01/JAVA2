package chap151031;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

// 1. ���� �ǳ� Ŭ���� �����
class RadioPanel extends JPanel implements ActionListener{
	// ������ ��Ÿ���� ���� ��ư �׷� �����
	ButtonGroup gb = new ButtonGroup();
	
	// ���̺� ����
	JLabel jl1 = new JLabel("    ����� ������?  ");
	JLabel jl2 = new JLabel("");
	
	// ���� ��ư ����
	JRadioButton[] jr = new JRadioButton[5];
	String[] gender = {"����", "����"};
	
	// ������
	public RadioPanel() {
		// ���� ������ư ��ü�� �迭 ����.
		for(int i = 0; i < 2; i++) {
			jr[i] = new JRadioButton(gender[i]);
			add(jr[i]); // ���� �ǳ� ��ü �߰�
			
			// ��ư �׷쿡 �߰�
			gb.add(jr[i]);
			
			// ������ ���
			jr[i].addActionListener(this);
		}
		add(jl1);
		add(jl2);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		jl2.setText(s);
	}
	
}

// 1. ������ �ǳ� Ŭ���� �����
class ComboxPanel extends JPanel implements ItemListener{
	// ���̺� ����
	JLabel jl1 = new JLabel("    ����� ��������?  ");
	JLabel jl2 = new JLabel("");
	
	// ������
	public ComboxPanel() {
		// �޺� �ڽ� ����
		JComboBox<String> jcb = new JComboBox<String>();
		jcb.addItem("A��");
		jcb.addItem("B��");
		jcb.addItem("AB��");
		jcb.addItem("O��");
		
		add(jl1);
		add(jl2);
		add(jcb);
		
		// ������ ���
		jcb.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object s = e.getItem();
		jl2.setText(s.toString());
		
	}
	
}

// GUI
class JTabPane extends JFrame {
	// ������
	public JTabPane() {
		// �����̳� ����
		Container ct = getContentPane();
		
		
		// 2. JTabbedPane() ��ü ����
		JTabbedPane jtp = new JTabbedPane();
		
		// ���� �ǳ�, �޺� �ǳ� ��ü ����
		RadioPanel rp = new RadioPanel();
		ComboxPanel cp = new ComboxPanel();
		
		// 3. JTabbedPane()�� �ǳ� �߰�
		jtp.addTab("����", rp);
		jtp.addTab("������", cp);
		
		// 4. �����̳ʿ� �߰�
		ct.add(jtp);
		
		// ���
		setTitle("JTabbedPaneTest");
		setSize(400, 150);
		setVisible(true);
	
	}
}

public class JTabbedPaneTest {

	public static void main(String[] args) {
		new JTabPane();
	}

}
