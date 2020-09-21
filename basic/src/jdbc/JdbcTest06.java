package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Util.ConnectionPool;

public class JdbcTest06 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnectionPool.getConnection();
			
			con.setAutoCommit(false);
			//setAutoCommit()의 매개변수를 False로 바꿔야 트랜잭션을 사용할 수 있다. 
			
			String sql = "update t_account "+
						 " set money = money - ?"
						 +" where id = ? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 30000);
			pstmt.setString(2, "id");
			pstmt.executeUpdate();
			System.out.println("id1 사용자의 계정 업데이트 완료");
			
			sql = "update t_account"
					+" set money = money + ?"
					+" where id = ?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, 30000);
			pstmt.setString(2, "id2");
			pstmt.executeUpdate();
			System.out.println("사용자의 계정 업데이트 완료");
			con.commit();
			//한꺼번에 commit
			
			
		} catch (Exception e) {
			
			try {
				con.rollback();
				//예외가 발생할 경우 롤백시켜서 데이터를 원상태로 돌린다. 
			}catch(SQLException e1	 ) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			ConnectionPool.close(con);
		}
	}
}
