package spms.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConnectionPool2 extends HttpServlet{
	
	private static final int INIT_COUNT = 5;
	private static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "hr";
	private static final String PASSWORD = "hr";
			

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(this.getInitParameter("JDBC_DRIVER"));
		ServletContext sc = this.getServletContext();
		System.out.println(sc.getInitParameter("JDBC_DRIVER"));
		
		ServletContext sc2 = this.getServletContext();
		
		Connection conn = (Connection)sc2.getAttribute("conn");			
	}

	private static List<Connection> freeList = 
			new ArrayList<Connection>();
	private static List<Connection> usedList = 
			new ArrayList<Connection>();
	
	static {
		try {
			Class.forName(JDBC_DRIVER);
			for( int i= 1;i<=INIT_COUNT;i++) {
				freeList.add(DriverManager.getConnection(URL,USER, PASSWORD));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws Exception {
		if(freeList.isEmpty()) {
			throw new Exception("모든 커넥션이 사용중입니다. 잠시만 기다려주세요.");
		}
		
		Connection con = freeList.remove(0);
		usedList.add(con);
		System.out.println("사용중 : " + usedList.size());
		System.out.println("남아있는 : " + freeList.size());
		return con;
	}
	
	public static void close(Connection con) {
		usedList.remove(usedList.indexOf(con));
		freeList.add(con);
	}
}
