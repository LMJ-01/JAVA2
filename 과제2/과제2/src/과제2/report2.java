package 과제2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class report22 extends JFrame {
	// 텍스트 필드 선언
	JTextField jtf = new JTextField(10);
	JTextField Rtl = new JTextField();
	
	public report22() {
		
		// 컨테이너 생성
		Container ct = getContentPane();
			
		// 배치 관리자 설정. 
		ct.setLayout(new BorderLayout());
		
		// 판넬 1번 
		// 판넬 생성
		JPanel jp1 = new JPanel();
		// 2행 1열
	    jp1.setLayout(new GridLayout(2, 1));
	    JLabel jl = new JLabel("길이를 입력하고, 도형의 버튼을 클릭하세요.");
	    jp1.add(jl);
	    jp1.add(jtf);
	    ct.add(jp1, BorderLayout.NORTH);
	    
	    // 판넬 2
	    // 판넬 생성
	    JPanel jp2 = new JPanel();
	    jp2.setLayout(new FlowLayout());
        JLabel sl = new JLabel();
        //버튼
        JButton CBtn = new JButton("원");
        JButton TBtn = new JButton("삼각형");
        JButton RBtn = new JButton("사각형");
        JButton Reset = new JButton("리셋");
        
        // 판넬에 버튼
        jp2.add(CBtn);
        jp2.add(TBtn);
        jp2.add(RBtn);
        jp2.add(Reset);
        ct.add(jp2, BorderLayout.CENTER);
        
        // 판넬 3번
        // 판넬 생성
        JPanel jp3 = new JPanel();
        // 2행 1열
        jp3.setLayout(new GridLayout(2, 1));
        JLabel rl = new JLabel("결과");
        jp3.add(rl);
        jp3.add(Rtl);
        ct.add(jp3, BorderLayout.SOUTH);
        
        // 각 버튼에 이벤트 리스러 등록 
        // 처리 객체로 내부 클래스 지정
        CBtn.addActionListener(new CBL());
        TBtn.addActionListener(new TBL());
        RBtn.addActionListener(new RBL());
        Reset.addActionListener(new ReBL());
		
		// 화면에 보이기
		setTitle("도형의 넓이 구하기 - 이명준");
		setSize(450, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	// 이벤트 리스너 내부 클래스
	private class CBL implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	        // 원을 클릭했을 때
	    	try {
	        int radius = Integer.parseInt(jtf.getText());
	        double Result = radius * radius * 3.14;
	    	Rtl.setText("원의 넓이: " + radius + " x " + radius + " x " + 3.14 + " = " + Result);
	    	}
	    	catch(NumberFormatException ex) {
	    		Rtl.setText("길이(숫자)를 입력하셔야 합니다.");
	    	}
	    	}
	}
	// 이벤트 리스너 내부 클래스
	private class TBL  implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// 삼각형을 클릭했을떄
			try {
			int side1 = Integer.parseInt(jtf.getText());
            double result = 0.5 * side1 * side1;
            Rtl.setText("삼각형의 넓이: " + side1 + " x " + side1 + " /2 = " + result);
			}
			catch(NumberFormatException ex) {
				Rtl.setText("길이(숫자)를 입력하셔야 합니다.");
			}
			}
	}
	// 이벤트 리스너 내부 클래스
	private class RBL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// 사각형을 클릭했을때
			try {
				int side2 = Integer.parseInt(jtf.getText());
	            double result = side2 * side2;
	            Rtl.setText("사각형의 넓이: " + side2 + " x " + side2 + " = " + result);
			}
			catch(NumberFormatException ex) {
				Rtl.setText("길이(숫자)를 입력하셔야 합니다.");
			}
		}
	}
	// 이벤트 리스너 내부 클래스
	private class ReBL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	// 리셋을 클릭했을떄
        	// 입력 결과 초기화
            jtf.setText("");
            Rtl.setText("");
        }
	}
}

public class report2 {

	public static void main(String[] args) {
		// 객체 생성
		new report22();
	}
}


