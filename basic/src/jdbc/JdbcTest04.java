package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcTest04 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnectionFactory.getConnection();
			Scanner sc = new Scanner(System.in);
			System.out.println("삭제할 게시물 번호: ");
			int no = sc.nextInt();
			
			String sql = "delete t1_board ";
			sql += "where no = ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt +"개의 행이 변경되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			ConnectionFactory.close(null, con);
		}
	}
}
