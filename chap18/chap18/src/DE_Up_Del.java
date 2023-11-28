




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DE_Up_Del {

	public static void main(String[] args) {
		Connection conn;
		String url = "jdbc:mysql://localhost:3306/dbstudent?serverTimezone=UTC";
		// �����ͺ��̽� URL           localhost �Ǵ� 127.0.0.1 �� ����.
		// connector 5.1.x ���Ĺ������� KSTŸ������ �ν����� ���ϴ� �̽��� �־� serverTimezone �߰�.
		// ���� �ѱ� ���� ������ �ִٸ� useUnicode=true&characterEncoding=UTF8 �߰� ����. 
		
		String id = "root";   // DB�� �α����� ID
		String pw = "1234";   // MYSQL ���� �� �Է��� PASSWORD
		
		// SQL�� ������ ���� ����ϴ� Ŭ���� : Statement
		Statement stmt = null;
		// SQL�� ���� ����� ������ ���� Ŭ���� : ResultSet
		ResultSet result = null;

		try {
			// 1�ܰ� JDBC ����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC ����̹� �ε�.
			
			// 2�ܰ� ������ ���̽� ����
			conn = DriverManager.getConnection(url, id, pw);  // �����ͺ��̽� ����.
			// DriverManager �ڹ� ���ø����̼��� JDBC����̹��� ��������ִ� Ŭ����. 
			// getConnection() �޼ҷ� DB�� �����Ͽ� Connection ��ü ��ȯ.
			System.out.println("DB ���� �Ϸ�");
			
			// 3�ܰ�. Statement ����
			stmt = conn.createStatement();
			
			// 4�ܰ�. SQL�� ����.
			//stmt.executeUpdate("insert into student (NAME, Dept, ID) values('�ڼҴ�','�ǳ��������к�', '201845023');");
			//stmt.executeUpdate("update update student set name='�۰���' where ID = '202045023';");
			stmt.executeUpdate("delete from student where name='�����';");
			
			// 5�ܰ� ��� �ޱ� (�޼ҵ� ȣ��)
			printTable(stmt);
			
			// 6�ܰ�. ���� ����
			//result.close();
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("DB ���� ���� - �����Ͱ� �̹� ������");
		}
	}
	
	// ��� ��� �޼ҵ�
	private static void printTable(Statement stmt)throws SQLException {
		// 5�ܰ� ��� �ޱ�
		ResultSet result = stmt.executeQuery("Select * from student");
		
		while(result.next()) {
			System.out.print(result.getString("NAME"));
			System.out.print("\t|\t" + result.getString("ID"));
			System.out.println("\t|\t" + result.getString("Dept"));
			
			// getString() �޼ҵ�� �ش� ������ Ÿ������ '��' ���� �о�´�.
			// ��� ������ Ÿ�Կ� ���� �о���� ����.
			// �ʿ�� ������ Ÿ�� ��ȯ�ؾ� ��
			
		}
		System.out.println();
		
		// 6�ܰ� ���� ����
		result.close();
	}
}
