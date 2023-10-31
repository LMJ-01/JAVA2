package chap151031;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class JComboBox1 extends JFrame implements ItemListener{
	JLabel fruitLabel; // �̹��� ǥ�õ� ����
	public JComboBox1() {
		// �޺� �ڽ� ��ü ����
		JComboBox<String> fruitCombo = new JComboBox<String>();
		
		// �̹��� ǥ�� ���� ��ü ����
		fruitLabel = new JLabel();
		
		// ���� �迭 ����
		String fruitList[] = {"apple", "banana", "cherry", "persimmom", "pear", "grape" };
		
		// �����̳� �����, ���̾ƿ� ����
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		
		// �޺��ڽ��� ���� ����Ʈ �߰�
		for (int i = 0; i < fruitList.length; i++) {
			fruitCombo.addItem(fruitList[i]);
		}
		
		// �����̳ʿ� �޺��ڽ�, ���̺� �߰�
		ct.add(fruitCombo);
		ct.add(fruitLabel);
		
		// �޺��ڽ��� �̺�Ʈ ������ ���
		fruitCombo.addItemListener(this);
		
		// ���
		setTitle("JComboBox Test1");
		setSize(500, 300);
		setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String fruit = (String)e.getItem();
		fruitLabel.setIcon(new ImageIcon("image/" + fruit + ".jpg"));
	}
	
}

public class JComboBoxTest {

	public static void main(String[] args) {
		new JComboBox1();

	}

}
