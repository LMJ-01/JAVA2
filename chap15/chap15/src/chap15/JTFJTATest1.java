package chap15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

// GUI Ŭ����
class JTFJTA1 extends JFrame implements ActionListener {
	// �ؽ�Ʈ �ʵ� ��ü ����
	private JTextField input;
	
	// �ؽ�Ʈ ����� ��ü ����.
	private JTextArea output;
	
	// �� ��ü ����
	private JLabel jl = new JLabel("�ؽ�Ʈ�� �Է��ϼ���.");
	
	// ������
	public JTFJTA1() {
		// 20�� �Է� ������ �ؽ�Ʈ �ʵ� ��ü ����
		input = new JTextField(20);
		
		// 10�� 20ĭ �ؽ�Ʈ ����� ��ü ����.
		output = new JTextArea(10, 20);
		
		// �ؽ�Ʈ ������ ���� �Ұ� ����
		output.setEditable(false);
		
		// �����̳� ����.
		Container ct = getContentPane();
		
		// ��ġ ������ ����. - FlowLayout
		ct.setLayout(new FlowLayout());
		
		// �г� ����.
		JPanel pl = new JPanel();
		
		// �гο� input/output �߰�
		pl.add(input);
		pl.add(output);
		
		// �гΰ� ���̺��� �����̳ʿ� �߰�
		ct.add(pl);
		ct.add(jl);
		
		// 3. ���۳�Ʈ�� ������ ���.
		input.addActionListener(this);
		
		// ȭ�鿡 ���̵���.... ������: 500, 300
		setTitle("JTextField �� JTextArea");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	// 4. �̺�Ʈ ó��
	@Override
	public void actionPerformed(ActionEvent e) {
		if(output.getLineCount() <= output.getRows()) {  // �ؽ�Ʈ �����  ũ�⺸�� ������ �߰�
			output.append(e.getActionCommand() + "\n");  // output�� �� ���� �߰�
			input.setText("");  // �� ���� ����(��ĭ����)
		}
		else {  // ���� ������...  
			jl.setText("�Է��� ����Ǿ����ϴ�.");
			input.setEditable(false);  // �Է� �Ұ�
			
		}
		
	}
	
}

// ���� Ŭ����
public class JTFJTATest1 {

	public static void main(String[] args) {
		new JTFJTA1();
	}

}
