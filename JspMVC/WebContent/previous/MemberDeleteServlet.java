package spms.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import spms.dao.MemberDAO;
import spms.util.ConnectionPool;

@SuppressWarnings("serial")
@WebServlet("/member/delete")
public class MemberDeleteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			ServletContext sc = this.getServletContext();
			
			MemberDAO memberDAO = (MemberDAO)sc.getAttribute("memberDAO");
			
			con = ConnectionPool.getConnection();
			response.setContentType("text/html; charset=UTF-8");
			String sql = "delete members "
					+ "where mno = ? ";
			
			pstmt = con.prepareStatement(sql);		
			pstmt.setInt(1, Integer.parseInt(request.getParameter("no")));
			pstmt.executeUpdate();
			
			response.sendRedirect("list");
		}catch(ServletException e) {
			e.printStackTrace();
			request.setAttribute("Error", e);
			RequestDispatcher rd = request.getRequestDispatcher("/member/error.jsp");
			rd.forward(request, response);
			} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			if(con != null) ConnectionPool.close(con);
		}

	}
	
}
