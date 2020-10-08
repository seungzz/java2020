package spms.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import spms.util.ConnectionPool;
import spms.vo.MemberVO;



@SuppressWarnings("serial")
@WebServlet("/auth/login")
public class LoginServlet extends HttpServlet{

	@Override()
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	RequestDispatcher rd = request.getRequestDispatcher("/auth/LogInForm.jsp");
	rd.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
		con = ConnectionPool.getConnection();
		String sql = "select * from members "
				+ "where email = ? and pwd = ? ";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, request.getParameter("email"));
		pstmt.setString(2, request.getParameter("password"));
		
		
		rs = pstmt.executeQuery();
		
		//결과가 하나라도 있다면 아래의 if문이 실행된다.
		if(rs.next()) {
			MemberVO member = new MemberVO().setEmail(rs.getString("email")).setName(rs.getString("mname"));
			HttpSession session = request.getSession();
			session.setAttribute("member", member);
			
			response.sendRedirect("../member/list");
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("/auth/LogInFail.jsp");
			rd.forward(request, response);
			
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {if(rs !=null)
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}try {if(pstmt !=null)
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(con!=null) ConnectionPool.close(con);
		}
	}

}
