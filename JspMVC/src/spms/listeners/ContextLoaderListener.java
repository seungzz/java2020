package spms.listeners;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import spms.dao.MemberDAO;

/* 서블릿 컨테이너는 웹 애플리케이션의 상태를 모니터링 할 수 있도록 웹 애플리케이션이 시작에서 종료까지 주요한 사건에 대해 알림 기능을 제공한다.
 * 화려한 알림 기능을 사용하려면, 규칙에 따라서 객체를 만들고 web.xml 파일에 등록해서 사용할 수 있다. 이렇게 사건이 발생했을 때 알림을 받는 객체를 
 * listener리스너 라고 한다.
 * 
 * 알림을 받는 주요 사건
 * 
 * 웹애플리케이션 -> 시작과 종료
 * 
 * 세션 -> 생성과 소멸
 * 
 * 요청 -> 요청을 받고 응답할 때, servletRequest에 값을 추가하고 제거할 때
 * 
 * 
 * ServletContextListener의 활용
 * 웹 애플리케이션의 시작과 종료 사건을 담당할 리스너를 준비한다.
 * AppInitServlet이 하던일을 이 리스너로 옮긴다. 또한 MemeberDAO인스턴스 생성도 이 리스너로 준비한다.
 * 
 * AppInit에서사용했던것을 거의 바꾸지 않고 그대로 사용한다. 
 * 
 */

@WebListener
public class ContextLoaderListener implements ServletContextListener{

	
	//웹 애플리케이션이 종료되기 전에 호출된다. 자원 해제를 해야 할때는 이 메소드에 작성한다. 
	@Override
	public void contextDestroyed(ServletContextEvent event) {
		
		System.out.println("AppInitServlet 마무리...");
		
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

	
	//웹애플리케이션이 시작될 때 호출된다. 공동객체를 준비한다면
	@Override
	public void contextInitialized(ServletContextEvent event) {
		// TODO Auto-generated method stub
		System.out.println("AppInitServlet 준비...");
		
		
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
			//servletcontext에 memberDAO를 저장해서 언제든지 꺼내서 사용할 수 있게 된다.
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	


	}
	

