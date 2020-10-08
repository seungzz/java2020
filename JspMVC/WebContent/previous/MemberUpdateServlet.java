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
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			//리스너에 흩어져있는 DAO객체를 가져오기 위해서 생성
			ServletContext sc = this.getServletContext();
			
			MemberDAO memberDAO	 = (MemberDAO)sc.getAttribute("memberDAO");
			con = ConnectionPool.getConnection();
			String sql = "select * from members "
					+ "where mno =" +request.getParameter("no");
			pstmt = con.prepareStatement(sql);		
			rs = pstmt.executeQuery();
			
			rs.next();
			
			rs.getInt("mno");
			rs.getString("mname");
			rs.getString("email");
			rs.getDate("cre_Date");
			
			MemberVO member = new MemberVO().setNo(rs.getInt("mno")).setCreateDate(rs.getDate("cre_Date")).setName(rs.getString("mname")).setEmail(rs.getString("email"));
			
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			
			request.setAttribute("member", member);
			
			
			
			RequestDispatcher rd = request.getRequestDispatcher("/member/MemberUpdateForm.jsp");
			rd.forward(request, response);
			
		
		
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", e);
		}finally {
			try {
				if(rs != null) {
				rs.close();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(pstmt != null) {
					pstmt.close();
			}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
			if(con != null)
				ConnectionPool.close(con);
		}
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnectionPool.getConnection();
			//request.setCharacterEncoding("UTF-8");
			String sql = "update members "
					+ "set email = ?, mname=?, mod_date = sysdate "
					+ "where mno = ? ";
		  			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, request.getParameter("email"));
			pstmt.setString(2, request.getParameter("name"));
			pstmt.setInt(3, Integer.parseInt(request.getParameter("no")));
			pstmt.executeUpdate();
			
			response.sendRedirect("list");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) {pstmt.close();}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if(con != null) ConnectionPool.close(con);
		}
		
		
	}
	}
	
	



