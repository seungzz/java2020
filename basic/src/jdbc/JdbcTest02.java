package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcTest02 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//1.드라이버fheld
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection con = DriverManager.getConnection(url,"hr","hr");
			//2.DriverManager를 통해서 connection객체 생성
			
			Scanner sc = new Scanner(System.in);
			
			String sql = "insert into t1_board(no, title, writer)";
			sql += "values(sq_t1_board_no.nextVal,?,?)";
			
			PreparedStatement pstnt = con.prepareStatement(sql);
			//3.sql문을 실행하고 스테이트먼트를 얻어옴
			System.out.println("제목을 입력하세요: ");
			pstnt.setString(1, sc.nextLine());
			//프리패어드스테이트먼트 객체에 1번->첫번째 물음표에 들어갈 값이 어떤것이다.
			System.out.println("저자를 입력하세요: ");
			pstnt.setString(2, sc.nextLine());
			
			int cnt = pstnt.executeUpdate();
			//4.sql문 실행 후 처리
			System.out.println(cnt +"개의 행이 변경되었습니다.");
			
			
			
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
