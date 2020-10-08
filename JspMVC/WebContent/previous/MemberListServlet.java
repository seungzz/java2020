package spms.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import spms.dao.MemberDAO;
import spms.util.ConnectionPool;
import spms.vo.MemberVO;


@SuppressWarnings("serial")
@WebServlet("/member/list")
public class MemberListServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
						
		try {
			
			ServletContext sc = this.getServletContext();
			
			MemberDAO memberDAO = (MemberDAO)sc.getAttribute("memberDAO");
			
			response.setContentType("text/html; charset=UTF-8");
			request.setAttribute("members", memberDAO.selectList());
			RequestDispatcher rd = request.getRequestDispatcher(
					"/member/MemberList.jsp");
			rd.include(request, response);
			
		} catch(ServletException e) {
			e.printStackTrace();
			
			request.setAttribute("error", e);
			RequestDispatcher rd = 
					request.getRequestDispatcher
					("/auth/LogInFormRequire.jsp");
			rd.forward(request, response);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//throw new ServletException(e);//ServletException��
			//ȣ���ϸ� �� Ĺ������ ServletException�� �޽��ϴ�. 
			//���������� ���� ���� �޽����� ��� 
			request.setAttribute("error", e); //������� �ʾƵ�
			//���߿� ������ ���� �� ������ ����Ҷ� ����ϱ� ���� request�� 
			//�����մϴ�.
			RequestDispatcher rd = 
				request.getRequestDispatcher("/Error.jsp");
			rd.forward(request, response);
		}
	}
}
