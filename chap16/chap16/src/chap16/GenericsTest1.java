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
		// ibox.setVolume(3.14); // 자료형이 달라서 오류.
		System.out.println("<Integer>박스의 부피 : " + ibox.getVolume());
		
		
		// 실수형 값 123.456 으로 박스의 부피 출력
		Box<Double> dbox = new Box<Double>();
		dbox.setVolume(123.456);
		System.out.println("<Double>박스의 부피 : " + dbox.getVolume());
		
	}

}
