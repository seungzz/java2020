package spms.servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import spms.controls.Controller;
import spms.controls.MemberAddController;
import spms.controls.MemberListController;
import spms.vo.MemberVO;

/*
 * 프론트 컨트롤러
 * MVC 구조중에 조금더 유지보수가 쉬운 구조로 개선을 하기위해
 * 서블릿을 프론트 컨트롤러와 페이지 컨트롤러로 분화 시킵니다.
 * 컨트롤러를 만들다 보면 요청 데이터를 처리하는 코르드나 모델로 뷰를
 * 제어하는 코드가 중복되는 경우가 있습니다. 중복 코드들은 유지보수를
 * 어렵게 만들기 때문에 프론트 컨트롤러를 통해서 이 문제를 해결할 수 있습니다.
 * 
 * 분화의 이유
 * 아무리 지바 가상머신이 가비지(쓰레기)를 찾아서 자동으로 없에준다고 해도,
 * 이 작업 또한 CPU를 사용하기 때문에 시스템 선능에 영향을 미칩니다.
 * 따라서 개발자는 늘 인스턴스의 생성과 소멸에 관심을 가지고 성능을 높일 수 있는 방법을 찾아야 합니다.
 * 이러한 분화를 통해서 중복되는 코드를 줄이고, 시스템의
 * 부하를 줄여서 시스템의 성능을 높일 수 있습니다.
 * 
 */
@WebServlet("*.do")
public class DispatcherServlet extends HttpServlet{

	//doget()이나 dopost()을 사용하지 않고 service() 를 사용하는
	//이유는 get이나 post 방식을 둘다 대응하면서, get이나 post가 아닌
	//방식에도 똑같이 응답하기 위해 service()를 사용합니다.
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		//클라이언트가 요청한 경로를 가져오는 메소드
		String servletPath= request.getServletPath();
		try {
			
			ServletContext sc =this.getServletContext();
			
			HashMap<String,Object> model = new HashMap<String,Object>();
			model.put("memberDAO", sc.getAttribute("memberDAO"));
			String pageControllerPath = null;
			Controller pageController=null;
			if(servletPath.equals("/member/list.do")) {
				pageController =new MemberListController();
			}else if(servletPath.equals("/member/add.do")){
				pageController = new MemberAddController();
				if(request.getParameter("email")!=null) {
					model.put("member", new MemberVO().setEmail(request.getParameter("email")).setName(request.getParameter("name")).setPassword(request.getParameter("password")));
				}
				
			}else if(servletPath.equals("/member/update.do")) {
				pageController = null;
				if(request.getParameter("email")!=null) {
					request.setAttribute("member", new MemberVO().setEmail(request.getParameter("email")).setName(request.getParameter("name")).setNo(Integer.parseInt(request.getParameter("no"))));
				}
			}else if(servletPath.equals("/member/delete.do")) {
				pageController = null;
			}else if("/auth/login.do".equals(servletPath)) {
				pageController = null;
			}else if("/auth/logout.do".equals(servletPath)) {
				pageController = null;
			}
			/*RequestDispatcher rd = request.getRequestDispatcher(pageController);
			rd.include(request, response);*/
			
			//"redirect :/member/memberList.jsp"
			String viewUrl = pageController.excute(model);
			
			for(String key : model.keySet()) {
				request.setAttribute(key, model.get(key));
			}
			
			if(viewUrl.startsWith("redirect:")) {
				response.sendRedirect(viewUrl.substring(9));
				return;
			}else {
				RequestDispatcher rd = request.getRequestDispatcher(viewUrl);
				rd.include(request, response);
			}
	}catch(Exception e) {
		e.printStackTrace();
		request.setAttribute("error", e);
		RequestDispatcher rd = request.getRequestDispatcher("/Error.jsp");
		rd.forward(request, response);
	}
	}

}
