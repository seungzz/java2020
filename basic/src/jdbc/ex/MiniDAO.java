package jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Util.ConnectionPool;
import jdbc.ConnectionFactory;

public class MiniDAO {
	Scanner sc = new Scanner(System.in);
	
	private static final int INET_COUNT = 10;
	private static List<Connection> freeList = new ArrayList<Connection>();
	private static List<Connection> usedList = new ArrayList<Connection>();
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			for(int i=1;i<INET_COUNT; i++) {
				freeList.add(DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws Exception {
		if(freeList.isEmpty()) {
			throw new Exception("모든 커넥션이 사용중입니다. 잠시만 기다려줴요.");
		}
		Connection con = freeList.remove(0);
		usedList.add(con);
		System.out.println("사용중: "+usedList.size());
		System.out.println("남아있는: "+freeList.size());
		return con;
	}
	public static void close(Connection con) {
		usedList.remove(usedList.indexOf(con));
		freeList.add(con);
	}	
	
	void select() {
		boolean run = true;
		int i=1;
		int j=10;
		
		try {
			
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection con = DriverManager.getConnection(url,"hr","hr");



			String sql = "select * from (select ROWNUM rnum, storename, id, storenum, location, ";
					sql += " recommendedmenu, price from t_board) ";
					sql += "where rnum between 1 and 10 ";
			
			
			PreparedStatement pstnt = con.prepareStatement(sql);
			ResultSet rs = pstnt.executeQuery();
			
			
			System.out.println("순번"+"\t"+"가게이름"+"\t"+"고유id"+"\t"+"가게번호"+"\t"+"가게위치"+"\t"+"추천메뉴"+"\t"+"메뉴가격");

			while(rs.next()) {	//true혹은 false반환
				int num = rs.getInt("rnum");
				String storename = rs.getString("storename");
				int storenum  = rs.getInt("storenum");
				String location = rs.getString("location");
				String recommendedmenu = rs.getString("recommendedmenu");
				int price = rs.getInt("price");
				int id = rs.getInt("id");

				System.out.println(num+"\t"+storename+"\t"+id+"\t"+storenum+"\t"+location+"\t"+recommendedmenu+"\t"+price);
				
				
			}
			
			
			while(run) {
				System.out.println("1.이전페이지 2.다음페이지 3.종료");
				System.out.println("입력하세요>>");
				int selectNo = sc.nextInt();
				
				sql = "select * from (select ROWNUM rnum, storename, storenum, location, ";
				sql += " recommendedmenu, price from t_board) ";
				
				
				switch (selectNo) {
				case 1:
					
					sql +="where rnum between "+(i-10) +"and " +(j-10) ;
					
				case 2:
					
					sql +="where rnum between "+(i+10) +"and " +(j+10) ;
				case 3:
				
					break;
					
				}
				run = false;
				
				 con = DriverManager.getConnection(url,"hr","hr");
				 pstnt = con.prepareStatement(sql);
				 rs = pstnt.executeQuery();
				 while(rs.next()) {	//true혹은 false반환
						int num = rs.getInt("rnum");
						String storename = rs.getString("storename");
						int storenum  = rs.getInt("storenum");
						String location = rs.getString("location");
						String recommendedmenu = rs.getString("recommendedmenu");
						int price = rs.getInt("price");
						System.out.println(num+"\t"+storename+"\t"+storenum+"\t"+location+"\t"+recommendedmenu+"\t"+price);
						
						
					}
				 
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
			System.out.println("가게이름: ");
			pstnt.setString(1, sc.nextLine());
			System.out.println("가게번호: ");
			pstnt.setInt(2, sc.nextInt());
			sc.nextLine();
			System.out.println("위치: " );
			pstnt.setString(3, sc.nextLine());
			
			System.out.println("추천메뉴: ");
			pstnt.setString(4, sc.nextLine());
			System.out.println("메뉴가격: ");
			pstnt.setInt(5, sc.nextInt());
			
			
			int cnt = pstnt.executeUpdate();
			System.out.println(cnt +"개의 행이 삽입되었습니다.");
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
		System.out.println("삭제할 게시물 번호: ");
		int no = sc.nextInt();
		
		String sql = "delete t_board ";
		sql += " where id = ?";
		
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
	
	void update() {
		try {
Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection con = DriverManager.getConnection(url,"hr","hr");
			
			Scanner sc = new Scanner(System.in);
//			PreparedStatement pstmt = null;
			String sql = "update t_board\n";
			System.out.println("수정할 이름");
			sql += "set storename = '"+ sc.nextLine();
			System.out.println("수정할 가게번호");
			sql += "' , storenum = '"+sc.nextInt();
			sc.nextLine();
			System.out.println("수정할 가게위치");
			sql += "', location = '"+sc.nextLine();
			System.out.println("수정할 고유id 입력");
			sql +="' where id = '"+sc.nextInt()+"'";
 		
			PreparedStatement pstnt = con.prepareStatement(sql);
			//sql을 실행하고 스테이트먼트를 얻어옴
			int cnt = pstnt.executeUpdate();
			System.out.println(cnt+"개의 행이 변경되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
		
	}
