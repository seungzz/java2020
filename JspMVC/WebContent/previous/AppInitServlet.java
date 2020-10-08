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
	 * ServletContext �����Ҵ� �� ���ø����̼��� ���۵� �� �����Ǿ� �� ���ø����̼��� ����� ������ ���� �ȴ�. 
	 * �� �����ҿ� �����͸� �����ϸ�, �� ���ø����̼��� ����Ǵ� ���ȿ��� jsp������ application ������ ���� �� �����Ҹ� ������ �� �ִ�.
	 * 
	 * �����ҿ� ���� �ְ� ������ ����� ��� ����
	 * �����Ұ�ü.setAttribute(Ű,��)//������
	 * �����Ұ�ü.getAttribute(Ű)//�� ��ȸ
	 */
	
	@Override
	public void destroy() {
		System.out.println("AppInitServlet ������...");
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
		System.out.println("AppInitServlet �غ�...");
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
