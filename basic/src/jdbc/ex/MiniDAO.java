package jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import Util.ConnectionPool;
import jdbc.ConnectionFactory;

public class MiniDAO {
	void select() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection con = DriverManager.getConnection(url,"hr","hr");

			String sql = "select id, storename, storenum, location, recommendedmenu, price ";
			sql +="from t_board ";
			sql +="order by id desc ";
			
			
			PreparedStatement pstnt = con.prepareStatement(sql);
			ResultSet rs = pstnt.executeQuery();
			
			while(rs.next()) {	//trueȤ�� false��ȯ
				int num = rs.getInt("id");
				String storename = rs.getString("storename");
				int storenum  = rs.getInt("storenum");
				String location = rs.getString("location");
				String recommendedmenu = rs.getString("recommendedmenu");
				int price = rs.getInt("price");
				System.out.println(num+"\t"+storename+"\t"+storenum+"\t"+location+"\t"+recommendedmenu+"\t"+price);
		
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
			
			String sql = "insert into t_board(id, storename, storenum, location, recommendedmenu, price)";
			sql += "values(sq_t_board.nextVal,?,?,?,?,?)";
			
			PreparedStatement pstnt = con.prepareStatement(sql);
			System.out.println("�����̸�: ");
			pstnt.setString(1, sc.nextLine());
			System.out.println("���Թ�ȣ: ");
			pstnt.setInt(2, sc.nextInt());
			sc.nextLine();
			System.out.println("��ġ: " );
			pstnt.setString(3, sc.nextLine());
			
			System.out.println("��õ�޴�: ");
			pstnt.setString(4, sc.nextLine());
			System.out.println("�޴�����: ");
			pstnt.setInt(5, sc.nextInt());
			
			
			int cnt = pstnt.executeUpdate();
			System.out.println(cnt +"���� ���� ���ԵǾ����ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
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
		
		String sql = "delete t_board ";
		sql += " where id = ?";
		
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
	
	void update() {
		try {
Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection con = DriverManager.getConnection(url,"hr","hr");
			
			Scanner sc = new Scanner(System.in);
//			PreparedStatement pstmt = null;
			String sql = "update t_board\n";
			System.out.println("������ �̸�");
			sql += "set storename = '"+ sc.nextLine();
			System.out.println("������ ���Թ�ȣ");
			sql += "' , storenum = '"+sc.nextInt();
			sc.nextLine();
			System.out.println("������ ������ġ");
			sql += "', location = '"+sc.nextLine();
			System.out.println("������ ��ȣ �Է�");
			sql +="' where id = '"+sc.nextInt()+"'";
 		
			PreparedStatement pstnt = con.prepareStatement(sql);
			//sql�� �����ϰ� ������Ʈ��Ʈ�� ����
			int cnt = pstnt.executeUpdate();
			System.out.println(cnt+"���� ���� ����Ǿ����ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}