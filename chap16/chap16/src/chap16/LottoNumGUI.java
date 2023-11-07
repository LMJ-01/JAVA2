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
		Container ct = getContentPane();  // 컨테이너
		ct.setLayout(new FlowLayout());  // 레이아웃
		
		JButton lotto = new JButton("로또 번호 자동생성");  // 버튼
		
		// 컨테이너에 버튼과 라벨 추가
		ct.add(lotto);
		ct.add(lotto_num);
		
		// 버튼에 리스너 추가
		lotto.addActionListener(this);
		
		// 화면에 출력
		setTitle("Lotto Number 생성기");
		setSize(500, 150);
		setVisible(true);
	}
	
	// 버튼을 누르면 발생하는 이벤트
	@Override
	public void actionPerformed(ActionEvent ae) {
		Random rnd_num = new Random();  // Random() 클래스로 객체 생성
		int[] lotto_number = new int[6];
		
		// 같은 번호가 있는지 확인을 위해 변수 생성
		int temp;
		int i = 0;
		
		a : while(i < 6) {
			// 랜덤 번호 생성
			temp = rnd_num.nextInt(45) + 1;
			
			// 배열에 저장된 값과 temp에 저장된 값을 비교하여 같으면 다시 랜덤수 발생
			for (int j =0; j <=i; j++) {
				if (temp == lotto_number[j]) {
					continue a;
				}
			}
			lotto_number[i] = temp; // temp 값 배열에 저장
			i++;
		}
		// Arrays.toString은 배열을 문자열 표현으로 변환하는데 사용하는 메서드
		lotto_num.setText("이번 주 로또 당첨번호 : " + Arrays.toString(lotto_number));
	}
}
public class LottoNumGUI {

	public static void main(String[] args) {
		new Lotto();
	}

}
