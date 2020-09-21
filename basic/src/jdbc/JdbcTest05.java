package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcTest05 {
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection con = DriverManager.getConnection(url,"hr","hr");

			String sql = "select no, title, writer, ";
			sql +="to_char(reg_date,'yyyy-mm-dd') as regDate ";
			sql +="from t1_board ";
			sql +="order by no desc";
			
			
			PreparedStatement pstnt = con.prepareStatement(sql);
			
			ResultSet rs = pstnt.executeQuery();
			while(rs.next()) {	//true혹은 false반환
				int num = rs.getInt("no");
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				String regDate = rs.getString("regDate");
				System.out.println(num+"\t"+title+"\t"+writer+"\t"+regDate);
			}
				rs.close();
				pstnt.close();
				con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
