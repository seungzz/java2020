package spms.listeners;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import spms.dao.MemberDAO;

/* ���� �����̳ʴ� �� ���ø����̼��� ���¸� ����͸� �� �� �ֵ��� �� ���ø����̼��� ���ۿ��� ������� �ֿ��� ��ǿ� ���� �˸� ����� �����Ѵ�.
 * ȭ���� �˸� ����� ����Ϸ���, ��Ģ�� ���� ��ü�� ����� web.xml ���Ͽ� ����ؼ� ����� �� �ִ�. �̷��� ����� �߻����� �� �˸��� �޴� ��ü�� 
 * listener������ ��� �Ѵ�.
 * 
 * �˸��� �޴� �ֿ� ���
 * 
 * �����ø����̼� -> ���۰� ����
 * 
 * ���� -> ������ �Ҹ�
 * 
 * ��û -> ��û�� �ް� ������ ��, servletRequest�� ���� �߰��ϰ� ������ ��
 * 
 * 
 * ServletContextListener�� Ȱ��
 * �� ���ø����̼��� ���۰� ���� ����� ����� �����ʸ� �غ��Ѵ�.
 * AppInitServlet�� �ϴ����� �� �����ʷ� �ű��. ���� MemeberDAO�ν��Ͻ� ������ �� �����ʷ� �غ��Ѵ�.
 * 
 * AppInit��������ߴ����� ���� �ٲ��� �ʰ� �״�� ����Ѵ�. 
 * 
 */

@WebListener
public class ContextLoaderListener implements ServletContextListener{

	
	//�� ���ø����̼��� ����Ǳ� ���� ȣ��ȴ�. �ڿ� ������ �ؾ� �Ҷ��� �� �޼ҵ忡 �ۼ��Ѵ�. 
	@Override
	public void contextDestroyed(ServletContextEvent event) {
		
		System.out.println("AppInitServlet ������...");
		
		Connection conn = (Connection)event.getServletContext().getAttribute("conn");
		
		
		try {
			if(conn!=null && conn.isClosed() == false) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	//�����ø����̼��� ���۵� �� ȣ��ȴ�. ������ü�� �غ��Ѵٸ�
	@Override
	public void contextInitialized(ServletContextEvent event) {
		// TODO Auto-generated method stub
		System.out.println("AppInitServlet �غ�...");
		
		
		try {
			
			ServletContext sc = event.getServletContext();
			Class.forName(sc.getInitParameter("JDBC_DRIVER"));
			
			Connection conn = DriverManager.getConnection(
					sc.getInitParameter("URL"),
					sc.getInitParameter("USER"),
					sc.getInitParameter("PASSWORD"));
					sc.setAttribute("conn", conn);
					
					
			MemberDAO memberDAO = new MemberDAO();		
			sc.setAttribute("memberDAO", memberDAO);
			//servletcontext�� memberDAO�� �����ؼ� �������� ������ ����� �� �ְ� �ȴ�.
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	


	}
	

