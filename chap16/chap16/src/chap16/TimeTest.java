package chap16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeTest {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now(); // ��¥ ���� Ŭ����
		LocalTime time = LocalTime.now(); // �ð� ���� Ŭ����
		LocalDateTime dt = LocalDateTime.now();  // ��¥�� �ð��� ��� ������ Ŭ����
		
		System.out.println("������ ��¥ : " + date);
		System.out.println("������ �ð� : " + time);
		System.out.println("������ ��¥�� �ð� : " + dt);
		
		String s = dt.getYear() + "��  ";
		
		s += dt.getMonthValue() + "��  ";
		s += dt.getDayOfMonth() + "��  ";
		s += dt.getDayOfWeek() + "  ";
		s += dt.getHour() + "��  ";
		s += dt.getMinute() + "��  ";
		s += dt.getSecond() + "��  ";
		
		System.out.println("������ ��¥�� �ð� : " + s);
		System.out.println("���ú��� 100�� ����� : " + date.plusDays(100));
		System.out.println("���ú��� 10�� ���� ��¥ : " + date.plusWeeks(10));
	}

}
