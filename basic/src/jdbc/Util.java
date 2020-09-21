package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Util {
	public static void main(String[] args) {
		Connection con =null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnectionFactory.getConnection();
			Scanner sc = new Scanner(System.in);
			System.out.println("������ �Խù� ��ȣ: ");
			int no = sc.nextInt();
			
			String sql  = "delete t1_board ";
			sql += "where no = ? ";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt+ "���� ���� ����Ǿ����ϴ�. ");
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			ConnectionFactory.close(pstmt, con);
		}
	}
}