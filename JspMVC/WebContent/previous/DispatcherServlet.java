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
	 * ����Ʈ ��Ʈ�ѷ� 
	 * MVC ���� �߿� ���� �� ���������� ���� ������ ������ �ϱ� ���� ������ ����Ʈ ��Ʈ�ѷ��� ������ ��Ʈ�ѷ��� ��ȭ��Ų��.
	 * ��Ʈ�ѷ��� ����� ���� ��û �����͸� ó���ϴ� �ڵ峪 �𵨰��並 �����ϴ� �ڵ尡 �ߺ��Ǵ� ��찡 �ֽ��ϴ�.
	 * �ߺ� �ڵ���� ���������� ��ư� ����� ������ ����Ʈ ��Ʈ�ѷ��� ���ؼ� �� ������ �ذ��� �� �ִ�.
	 * 
	 * ��ȭ�� ����
	 * �ƹ��� �ڹ� ����ӽ��� �����⸦ ã�Ƽ� �ڵ����� �����شٰ� �ص�, �� �۾� ���� CPU�� ����ϱ� ������ �ý��� ���ɿ� ������ ��ģ��.
	 * ���� �����ڴ� �� �ν��Ͻ��� ������ �Ҹ꿡 ������ ������ ������ ���� �� �ִ� ����� ã�ƾ� �Ѵ�.
	 */
	
	
	
	//doGet()�̳� doPost()�� ������� �ʰ� service()�� ����ϴ� ������ get�̳� post ����� �� �� �����ϸ鼭, get�̳� post�� �ƴ� ��Ŀ���
	//�Ȱ��� �����ϱ� ���� service()�� ����Ѵ�.
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html); charset=UTF-8");
		
		
		//Ŭ���̾�Ʈ�� ��û�� ��θ� �о���� �� = getservletPath(). ��δ� servletPath�� ������ �Ǿ���.
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
