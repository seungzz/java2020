package spms.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class AppInitServlet extends HttpServlet{
	
	/*
	 * ServletContext 보관소는 웹 애플리케이션이 시작될 때 생성되어 웹 애플리케이션이 종료될 때까지 유지 된다. 
	 * 이 보관소에 데이터를 보관하면, 웹 애플리케이션이 실행되는 동안에는 jsp에서는 application 변수를 통해 이 보관소를 참조할 수 있다.
	 * 
	 * 보관소에 값을 넣고 빼내는 방법은 모두 같다
	 * 보관소객체.setAttribute(키,값)//값저장
	 * 보관소객체.getAttribute(키)//값 조회
	 */
	
	@Override
	public void destroy() {
		System.out.println("AppInitServlet 마무리...");
		super.destroy();
		Connection conn = (Connection)this.getServletContext().getAttribute("conn");
		
		
		try {
			if(conn!=null && conn.isClosed() == false) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("AppInitServlet 준비...");
		super.init(config);
		
		
		try {
			ServletContext sc = this.getServletContext();
			Class.forName(sc.getInitParameter("JDBC_DRIVER"));
			
			Connection conn = DriverManager.getConnection(
					sc.getInitParameter("URL"),
					sc.getInitParameter("USER"),
					sc.getInitParameter("PASSWORD"));
					sc.setAttribute("conn", conn);
					
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	

}
