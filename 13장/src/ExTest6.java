
public class ExTest6 {
	public static void main(String[] args) {
		try {
			method1();
			System.out.println("�޼ҵ�ȣ����");
		}
		catch (ArrayStoreException ex) {
			System.out.println("ArrayStorException ���� �߻�");
		}
		catch (ArithmeticException ex) {
			System.out.println("ArithmeticException ���� �߻�");
		}
	}
	static void method1() throws RuntimeException {
		int a = 0;
		int b = 2 / a;
		System.out.println("��������");
	}
}
