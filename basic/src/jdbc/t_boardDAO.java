package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Util.ConnectionPool;

public class t_boardDAO {

	void select() {
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
			while(rs.next()) {	//trueȤ�� false��ȯ
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
			e.printStackTrace();
		}
	}
	void insert() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection con = DriverManager.getConnection(url,"hr","hr");
			
			Scanner sc = new Scanner(System.in);
			
			String sql = "insert into t1_board(no, title, writer)";
			sql += "values(sq_t1_board_no.nextVal,?,?)";
			
			PreparedStatement pstnt = con.prepareStatement(sql);
			System.out.println("������ �Է��ϼ���: ");
			pstnt.setString(1, sc.nextLine());
			System.out.println("���ڸ� �Է��ϼ���: ");
			pstnt.setString(2, sc.nextLine());
			
			int cnt = pstnt.executeUpdate();
			System.out.println(cnt +"���� ���� ���ԵǾ����ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	void update() {

		Scanner sc = new Scanner(System.in);
		System.out.println("1.title���� | 2.writer����");
		int selectNo = sc.nextInt();
		switch(selectNo) {
		case 1:
		try {
			PreparedStatement pstmt = null;
			Connection con = null;

			con = ConnectionPool.getConnection();
			con.setAutoCommit(false);
			System.out.println("������Ʈ�� �Խù� ��ȣ �Է�>>");
			int no1 = sc.nextInt();
			System.out.println("������ title �Է�>>");
			String newTitle = sc.nextLine();
			String sql = "update t1_board "+
						 " set title = ?"
						 +" where no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, newTitle);
			pstmt.setInt(2, no1);
			pstmt.executeUpdate();
			
			System.out.println(" ������Ʈ �Ϸ�");
			
			sql = "update t1_board"
					+" set writer = ?"
					+" where no = ?";
			pstmt = con.prepareStatement(sql);

		}catch (Exception e) {
				e.printStackTrace();

	}
	}
	
	}
	
	void delete() {
		Connection con = null;
		PreparedStatement pstmt = null;
	
	try {
		con = ConnectionFactory.getConnection();
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Խù� ��ȣ: ");
		int no = sc.nextInt();
		
		String sql = "delete t1_board ";
		sql += " where no = ?";
		
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, no);
		
		int cnt = pstmt.executeUpdate();
		System.out.println(cnt +"���� ���� ����Ǿ����ϴ�.");
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		ConnectionFactory.close(null, con);
	}
}

		
	}

