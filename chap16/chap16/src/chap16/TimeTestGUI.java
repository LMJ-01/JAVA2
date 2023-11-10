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
	private JLabel jl = new JLabel("당신의 생일을공백으로 구분하여 입력(예:2020 01 01)");
	
	public MyTime() {
		
		Container ct = getContentPane();  // 컨테이너
		ct.setLayout(new FlowLayout()); // 레이아웃
		
		// 판넬 추가
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		
		jtf = new JTextField(10);
		
		JButton jb1 = new JButton("현재"); // 버튼
		JButton jb2 = new JButton("100살"); // 버튼
		
		// 텍스트에어리어 수정불가
		jta1 = new JTextArea(4,30);
		jta1.setEditable(false);
		
		jta2 = new JTextArea(4,30);
		jta2.setEditable(false);
		
		// 판넬에 라벨과 텍스트 필드 추가
		jp1.add(jl);
		jp1.add(jtf);
		
		// 판넬에 버튼과 텍스트 에어리어 추가
		jp2.add(jb1);
		jp2.add(jta1);
		
		jp3.add(jb2);
		jp3.add(jta2);
		
		// 컨테이너에 판넬추가
		ct.add(jp1);
		ct.add(jp2);
		ct.add(jp3);
		
		// 버튼에 리스너 추가
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
		
		// 화면에 출력
		setTitle("TimeTestGUI");
		setSize(500, 500);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// 텍스트 필드 입력된 문자열 StringTokenizer 년 월 일
		String birth = jtf.getText();
		StringTokenizer st1 = new StringTokenizer(birth);
		
		int year = Integer.parseInt(st1.nextToken());
		int month = Integer.parseInt(st1.nextToken());
		int day = Integer.parseInt(st1.nextToken());
		
		// 생일, 현재, 100살 LocalDate 객체 생성
		LocalDate my_birth = LocalDate.of(year, month, day);
		LocalDate current = LocalDate.now();
		LocalDate hundred = my_birth.plusYears(99);
		
		// 현재 버튼을 눌렀을때
		if(ae.getActionCommand() == "현재") {
		
		// 생일, 오늘 날짜 출력
		jta1.append("당신의 생일은 : " + toString(my_birth)+ "\n");
		jta1.append("오늘 날짜는 : "+ toString(current)+ "\n");
		// 생일로부터 날짜 계산하여 출력
		jta1.append("생일로부터 오늘까지의 일  : "+ my_birth.until(current, ChronoUnit.DAYS) + "\n");
		jta1.append("생일로부터 오늘까지의 년 :  "+ my_birth.until(current, ChronoUnit.YEARS));
		}
		// 100살 버튼을 눌렀을때
		else {
		// 생일로부터 100년 뒤 	
		jta2.append("당신이 100살이 되는 날은 : " + toString(hundred) + "\n");
		// 생일로부터 100년 뒤 주(week) 수 출력
		jta2.append("100살까지 남은 주(week)수 : " + current.until(hundred, ChronoUnit.WEEKS) + "\n");
		// 생일로부터 100년뒤 일 수 출력
		jta2.append("100살까지 남은 일 수 : " + current.until(hundred, ChronoUnit.DAYS));
		// 텍스트 필드 수정불가
		jtf.setEditable(false);
		}
	}
	
	// 년 월 일 문자열 반환
	private String toString(LocalDate Time) {
		return Time.getYear() + "년 " + Time.getMonthValue() + "월 " + Time.getDayOfMonth() + "일";
		
	}
	
	
}

public class TimeTestGUI {

	public static void main(String[] args) {
		new MyTime();
	}

}
