package chap16;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Lotto extends JFrame implements ActionListener {
		
	private JLabel lotto_num = new JLabel();
	
	public Lotto() {
		Container ct = getContentPane();  // �����̳�
		ct.setLayout(new FlowLayout());  // ���̾ƿ�
		
		JButton lotto = new JButton("�ζ� ��ȣ �ڵ�����");  // ��ư
		
		// �����̳ʿ� ��ư�� �� �߰�
		ct.add(lotto);
		ct.add(lotto_num);
		
		// ��ư�� ������ �߰�
		lotto.addActionListener(this);
		
		// ȭ�鿡 ���
		setTitle("Lotto Number ������");
		setSize(500, 150);
		setVisible(true);
	}
	
	// ��ư�� ������ �߻��ϴ� �̺�Ʈ
	@Override
	public void actionPerformed(ActionEvent ae) {
		Random rnd_num = new Random();  // Random() Ŭ������ ��ü ����
		int[] lotto_number = new int[6];
		
		// ���� ��ȣ�� �ִ��� Ȯ���� ���� ���� ����
		int temp;
		int i = 0;
		
		a : while(i < 6) {
			// ���� ��ȣ ����
			temp = rnd_num.nextInt(45) + 1;
			
			// �迭�� ����� ���� temp�� ����� ���� ���Ͽ� ������ �ٽ� ������ �߻�
			for (int j =0; j <=i; j++) {
				if (temp == lotto_number[j]) {
					continue a;
				}
			}
			lotto_number[i] = temp; // temp �� �迭�� ����
			i++;
		}
		// Arrays.toString�� �迭�� ���ڿ� ǥ������ ��ȯ�ϴµ� ����ϴ� �޼���
		lotto_num.setText("�̹� �� �ζ� ��÷��ȣ : " + Arrays.toString(lotto_number));
	}
}
public class LottoNumGUI {

	public static void main(String[] args) {
		new Lotto();
	}

}
