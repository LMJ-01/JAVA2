package chap16;

class Box<T> {
	T vol;
	void setVolume(T v) {
		vol = v;
	}
	
	T getVolume() {
		return vol;
	}
}

public class GenericsTest1 {

	public static void main(String[] args) {
		Box<Integer> ibox = new Box<Integer>();
		ibox.setVolume(200);
		// ibox.setVolume(3.14); // �ڷ����� �޶� ����.
		System.out.println("<Integer>�ڽ��� ���� : " + ibox.getVolume());
		
		
		// �Ǽ��� �� 123.456 ���� �ڽ��� ���� ���
		Box<Double> dbox = new Box<Double>();
		dbox.setVolume(123.456);
		System.out.println("<Double>�ڽ��� ���� : " + dbox.getVolume());
		
	}

}
