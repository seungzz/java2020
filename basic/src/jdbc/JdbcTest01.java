package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcTest01 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//1.����̹��ε�
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			Connection con = DriverManager.getConnection(url,"hr","hr");
			System.out.println("���Ἲ��"+con);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
