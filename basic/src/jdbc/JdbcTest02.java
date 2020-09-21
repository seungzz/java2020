package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcTest02 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//1.����̹�fheld
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection con = DriverManager.getConnection(url,"hr","hr");
			//2.DriverManager�� ���ؼ� connection��ü ����
			
			Scanner sc = new Scanner(System.in);
			
			String sql = "insert into t1_board(no, title, writer)";
			sql += "values(sq_t1_board_no.nextVal,?,?)";
			
			PreparedStatement pstnt = con.prepareStatement(sql);
			//3.sql���� �����ϰ� ������Ʈ��Ʈ�� ����
			System.out.println("������ �Է��ϼ���: ");
			pstnt.setString(1, sc.nextLine());
			//�����о�彺����Ʈ��Ʈ ��ü�� 1��->ù��° ����ǥ�� �� ���� ����̴�.
			System.out.println("���ڸ� �Է��ϼ���: ");
			pstnt.setString(2, sc.nextLine());
			
			int cnt = pstnt.executeUpdate();
			//4.sql�� ���� �� ó��
			System.out.println(cnt +"���� ���� ����Ǿ����ϴ�.");
			
			
			
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
