
public class ExTest1 {
	public static void main(String[] args) {
		int a = 0;
		int b = 2;
		try {
			System.out.println("2/0�� : ");
			int div = b / a;
			System.out.println(div);
		}
		catch (RuntimeException ex) {
			System.out.println("RuntimeException ���� �߻�");
		}
		catch (Exception ex) {
			System.out.println("Exception ���� �߻�");
		}
	}
}
