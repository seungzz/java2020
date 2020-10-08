package spms.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import spms.vo.MemberVO;

public class DispatcherServlet extends HttpServlet{

	/*
	 * 프론트 컨트롤러 
	 * MVC 구조 중에 조금 더 유지보수가 쉬운 구조로 개선을 하기 위해 서블릿을 프론트 컨트롤러와 페이지 컨트롤러로 분화시킨다.
	 * 컨트롤러를 만들다 보면 요청 데이터를 처리하는 코드나 모델과뷰를 제어하는 코드가 중복되는 경우가 있습니다.
	 * 중복 코드들은 유지보수를 어렵게 만들기 때문에 프론트 컨트롤러를 통해서 이 문제를 해결할 수 있다.
	 * 
	 * 분화의 이유
	 * 아무리 자바 가상머신이 쓰레기를 찾아서 자동으로 없애준다고 해도, 이 작업 또한 CPU를 사용하기 때문에 시스템 성능에 영향을 미친다.
	 * 따라서 개발자는 늘 인스턴스의 생성과 소멸에 관심을 가지고 성능을 높일 수 있는 방법을 찾아야 한다.
	 */
	
	
	
	//doGet()이나 doPost()를 사용하지 않고 service()를 사용하는 이유는 get이나 post 방식을 둘 다 대응하면서, get이나 post가 아닌 방식에도
	//똑같이 응답하기 위해 service()를 사용한다.
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html); charset=UTF-8");
		
		
		//클라이언트가 요청한 경로를 읽어오는 것 = getservletPath(). 경로는 servletPath에 저장이 되었다.
		String servletPath = request.getServletPath();
		String pageController = null;
		
		if(servletPath.equals("/member/list.do")) {
			pageController = "/member/list";
			
		}else if(servletPath.equals("/member/add.do")) {
			pageController = "/member/add";
			if(request.getParameter("email")!=null) {
				request.setAttribute("member", new MemberVO().setEmail(request.getParameter("email"))
						.setName(request.getParameter("name")).setPassword(request.getParameter("password")));
			}
			else if(servletPath.contentEquals("/member/update.do")) {
				pageController = "/member/update";
				if(request.getParameter("email")!=null) {
					request.setAttribute("member", new MemberVO().setEmail(request.getParameter("email"))
							.setName(request.getParameter("name")).setNo(Integer.parseInt(request.getParameter("no"))));
				}
			}else if("/member/delete.do".equals(servletPath)) {
				pageController = "/member/delete";
			}else if("/auth/login.do".equals(servletPath)) {
				pageController = "/auth/login";
			}else if("/auth/logout.do".equals(servletPath)) {
				pageController = "/auth/logout";
			}
			
			RequestDispatcher rd = request.getRequestDispatcher(pageController);
			rd.include(request, response);
			
			
			String viewUrl = (String)request.getAttribute("viewUrl");
			if(viewUrl.startsWith("redirect:")) {
				response.sendRedirect(viewUrl.substring(9));
				return;
			}else {
				rd = request.getRequestDispatcher(viewUrl);
				rd.include(request, response);
			}
		}
	
	}
	

}
