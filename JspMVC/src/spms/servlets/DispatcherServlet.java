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
 * ����Ʈ ��Ʈ�ѷ�
 * MVC �����߿� ���ݴ� ���������� ���� ������ ������ �ϱ�����
 * ������ ����Ʈ ��Ʈ�ѷ��� ������ ��Ʈ�ѷ��� ��ȭ ��ŵ�ϴ�.
 * ��Ʈ�ѷ��� ����� ���� ��û �����͸� ó���ϴ� �ڸ��峪 �𵨷� �並
 * �����ϴ� �ڵ尡 �ߺ��Ǵ� ��찡 �ֽ��ϴ�. �ߺ� �ڵ���� ����������
 * ��ư� ����� ������ ����Ʈ ��Ʈ�ѷ��� ���ؼ� �� ������ �ذ��� �� �ֽ��ϴ�.
 * 
 * ��ȭ�� ����
 * �ƹ��� ���� ����ӽ��� ������(������)�� ã�Ƽ� �ڵ����� �����شٰ� �ص�,
 * �� �۾� ���� CPU�� ����ϱ� ������ �ý��� ���ɿ� ������ ��Ĩ�ϴ�.
 * ���� �����ڴ� �� �ν��Ͻ��� ������ �Ҹ꿡 ������ ������ ������ ���� �� �ִ� ����� ã�ƾ� �մϴ�.
 * �̷��� ��ȭ�� ���ؼ� �ߺ��Ǵ� �ڵ带 ���̰�, �ý�����
 * ���ϸ� �ٿ��� �ý����� ������ ���� �� �ֽ��ϴ�.
 * 
 */
@WebServlet("*.do")
public class DispatcherServlet extends HttpServlet{

	//doget()�̳� dopost()�� ������� �ʰ� service() �� ����ϴ�
	//������ get�̳� post ����� �Ѵ� �����ϸ鼭, get�̳� post�� �ƴ�
	//��Ŀ��� �Ȱ��� �����ϱ� ���� service()�� ����մϴ�.
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		//Ŭ���̾�Ʈ�� ��û�� ��θ� �������� �޼ҵ�
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
