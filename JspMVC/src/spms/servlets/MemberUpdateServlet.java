package spms.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import spms.dao.MemberDAO;
import spms.util.ConnectionPool;
import spms.vo.MemberVO;

@SuppressWarnings("serial")
@WebServlet("/member/update")
public class MemberUpdateServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		request.setAttribute("viewUrl", "/member/MemberUpdateForm.jsp");
		

	}
	


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("viewUrl", "/member/MemberForm.jsp");
		
		
		
		try {
			
			ServletContext sc = this.getServletContext();
			MemberDAO memberDAO = (MemberDAO)sc.getAttribute("memberDAO");
			
			MemberVO member = (MemberVO)request.getAttribute("member");
			memberDAO.insert(member);
			request.setAttribute("viewUrl", "redirect:list.do");
		
		
		}catch (Exception e) {
			e.printStackTrace();
			throw new ServletException();
			
		
		
		
	}
	}
	
}



