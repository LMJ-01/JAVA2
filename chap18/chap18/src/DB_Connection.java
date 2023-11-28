import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Connection {

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
			//result = stmt.executeQuery("select * from student");
			result = stmt.executeQuery("select * from student where name='�����' ");
			// 5�ܰ� ��� �ޱ� (�޼ҵ� �����)
			printData(result, "NAME", "Dept", "ID");
			
			// 6�ܰ�. ���� ����
			result.close();
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("DB ���� ����");
		}
	}
	
	// ��� ��� �޼ҵ�
	private static void printData(ResultSet srs, String col1, String col2, String col3)throws SQLException {
		while(srs.next()) {
			if(!col1.equals("")) {
				System.out.print(srs.getString("NAME"));
			}
			if(!col2.equals("")) {
				System.out.print("\t|\t" + srs.getString("ID"));
			}
			if(!col3.equals("")) {
				System.out.print("\t|\t" + srs.getString("Dept"));
			}
			else {
				System.out.println();
			}
		}
	}
}

