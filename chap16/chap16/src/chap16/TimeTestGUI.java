package chap16;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MyTime extends JFrame implements ActionListener {
	private JTextField jtf;
	private JTextArea jta1, jta2;
	private JLabel jl = new JLabel("����� �������������� �����Ͽ� �Է�(��:2020 01 01)");
	
	public MyTime() {
		
		Container ct = getContentPane();  // �����̳�
		ct.setLayout(new FlowLayout()); // ���̾ƿ�
		
		// �ǳ� �߰�
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		
		jtf = new JTextField(10);
		
		JButton jb1 = new JButton("����"); // ��ư
		JButton jb2 = new JButton("100��"); // ��ư
		
		// �ؽ�Ʈ����� �����Ұ�
		jta1 = new JTextArea(4,30);
		jta1.setEditable(false);
		
		jta2 = new JTextArea(4,30);
		jta2.setEditable(false);
		
		// �ǳڿ� �󺧰� �ؽ�Ʈ �ʵ� �߰�
		jp1.add(jl);
		jp1.add(jtf);
		
		// �ǳڿ� ��ư�� �ؽ�Ʈ ����� �߰�
		jp2.add(jb1);
		jp2.add(jta1);
		
		jp3.add(jb2);
		jp3.add(jta2);
		
		// �����̳ʿ� �ǳ��߰�
		ct.add(jp1);
		ct.add(jp2);
		ct.add(jp3);
		
		// ��ư�� ������ �߰�
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
		
		// ȭ�鿡 ���
		setTitle("TimeTestGUI");
		setSize(500, 500);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// �ؽ�Ʈ �ʵ� �Էµ� ���ڿ� StringTokenizer �� �� ��
		String birth = jtf.getText();
		StringTokenizer st1 = new StringTokenizer(birth);
		
		int year = Integer.parseInt(st1.nextToken());
		int month = Integer.parseInt(st1.nextToken());
		int day = Integer.parseInt(st1.nextToken());
		
		// ����, ����, 100�� LocalDate ��ü ����
		LocalDate my_birth = LocalDate.of(year, month, day);
		LocalDate current = LocalDate.now();
		LocalDate hundred = my_birth.plusYears(99);
		
		// ���� ��ư�� ��������
		if(ae.getActionCommand() == "����") {
		
		// ����, ���� ��¥ ���
		jta1.append("����� ������ : " + toString(my_birth)+ "\n");
		jta1.append("���� ��¥�� : "+ toString(current)+ "\n");
		// ���Ϸκ��� ��¥ ����Ͽ� ���
		jta1.append("���Ϸκ��� ���ñ����� ��  : "+ my_birth.until(current, ChronoUnit.DAYS) + "\n");
		jta1.append("���Ϸκ��� ���ñ����� �� :  "+ my_birth.until(current, ChronoUnit.YEARS));
		}
		// 100�� ��ư�� ��������
		else {
		// ���Ϸκ��� 100�� �� 	
		jta2.append("����� 100���� �Ǵ� ���� : " + toString(hundred) + "\n");
		// ���Ϸκ��� 100�� �� ��(week) �� ���
		jta2.append("100����� ���� ��(week)�� : " + current.until(hundred, ChronoUnit.WEEKS) + "\n");
		// ���Ϸκ��� 100��� �� �� ���
		jta2.append("100����� ���� �� �� : " + current.until(hundred, ChronoUnit.DAYS));
		// �ؽ�Ʈ �ʵ� �����Ұ�
		jtf.setEditable(false);
		}
	}
	
	// �� �� �� ���ڿ� ��ȯ
	private String toString(LocalDate Time) {
		return Time.getYear() + "�� " + Time.getMonthValue() + "�� " + Time.getDayOfMonth() + "��";
		
	}
	
	
}

public class TimeTestGUI {

	public static void main(String[] args) {
		new MyTime();
	}

}
