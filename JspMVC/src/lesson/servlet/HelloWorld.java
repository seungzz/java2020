package lesson.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//서블릿 클래스는 반드시 javax.servlet.Servlet인터페이스를 구현해야 한다.
//서블릿 컨테이너가  서블릿에 대해 호출할 메소드를 정의한 것이 Servlet 인터페이스이다.
public class HelloWorld implements Servlet{
	private ServletConfig config;



	//Servlet 인터페이스에 정의된 5개의 메소드 중 생명주기에 관련된 메소드는 init()생성, service()실행, destroy()소멸이다.
	@Override
	public void init(ServletConfig config) throws ServletException {
		// 서블릿을 생성한 후에 초기화  작업을 위해 수행하는 메소드
		
		System.out.println("init() 호출됨");
		this.config = config;
		
	}
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service() 호출됨");
	}
	
	
	@Override
	public void destroy() {
		System.out.println("destroy() 호출됨");
		//서블릿 컨테이너가 종료되거나 해당 서블릿을 비활성화 시킬때 실행
	}

	@Override
	public ServletConfig getServletConfig() {
		//서블릿 설정 정보를 다루는 ServletConfig객체반환
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	//서블릿을 작성한 사람의 정보, 서블릿 버전 권리 등을 담은 문자열을 반환한다.
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
