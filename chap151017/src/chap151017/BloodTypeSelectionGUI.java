/*package chap151017;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class JLabel1 extends JFrame implements ActionListener {
	private JLabel result = new JLabel();
	public JLabel1() {
		// 컨테이너 생성
		Container ct = getContentPane();
						
		// 배치 관리자 설정. (FlowLayout)
		ct.setLayout(new GridLayout(1,5));
	
		
		JButton A = new JButton("A형");
		JButton B = new JButton("B형");
		JButton AB = new JButton("AB형");
		JButton O = new JButton("O형");
		
		ct.add(A);
		ct.add(B);
		ct.add(AB);
		ct.add(O);
		ct.add(result);
		
		A.addActionListener(this);
		B.addActionListener(this);
		AB.addActionListener(this);
		O.addActionListener(this);
		
		// 화면 보여주기
		setTitle("BloodTest");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand()== "A형") {
			result.setText("A형");
		}
		else {
			result.setText("B형");
		}
		else {
			
		}
	}
	
}
public class BloodTest {

	public static void main(String[] args) {
		new JLabel1();

	}

}
*/
package chap151017;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BloodType1 extends JFrame implements ActionListener {
    private JLabel resultLabel;

    public BloodType1() {
        // 프레임 초기화
        setTitle("혈액형 선택 프로그램");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 1)); // 6행 1열의 그리드 레이아웃

        // 레이블 초기화
        JLabel introLabel = new JLabel("당신의 혈액형은?");
        resultLabel = new JLabel("선택한 혈액형은: ");
        add(introLabel);

        // 패널 초기화
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 4)); // 1행 4열의 그리드 레이아웃

        // 버튼 초기화
        JButton[] bloodTypeButtons = new JButton[4];
        String[] bloodTypes = {"A형", "B형", "AB형", "O형"};
        for (int i = 0; i < 4; i++) {
            bloodTypeButtons[i] = new JButton(bloodTypes[i]);
            bloodTypeButtons[i].addActionListener(this); // ActionListener를 현재 클래스로 등록
            buttonPanel.add(bloodTypeButtons[i]);
        }

        add(buttonPanel);
        add(resultLabel);

        // 프레임 표시
        //pack();
        //setLocationRelativeTo(null); // 화면 중앙에 표시
        setVisible(true);
    }

    // ActionListener 인터페이스의 actionPerformed 메서드를 오버라이딩
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton sourceButton = (JButton) e.getSource();
        String selectedBloodType = sourceButton.getText();
        resultLabel.setText("선택한 혈액형은: " + selectedBloodType);
    }
}

public class BloodTypeSelectionGUI {
    public static void main(String[] args) {
            new BloodType1();
  
    }
}
