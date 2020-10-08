package spms.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
@WebServlet("/member/add")
public class MemberAddServlet extends HttpServlet{

@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setAttribute("viewUrl", "/member/MemberForm.jsp");
		// service()가 하는 역할을 한다.
		/*@Override	response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>회원가입</title></head>");
		out.println("<body><h1>회원등록</h1>");
		out.println("<form action ='add' method='post'>");
		out.println("이름: <input type ='text' name='name'><br>");
		out.println("이메일: <input type ='text' name='email'><br>");
		out.println("암호: <input type ='password' name='password'><br>");
		out.println("<input type ='submit' value='추가'>");
		out.println("<input type ='reset' value='취소'><br>");
		out.println("</form>");
		out.println("</body></html>");
		
		*/
		
		/*try {
			
			ServletContext sc = this.getServletContext();
			
			MemberDAO memberDAO = (MemberDAO)sc.getAttribute("memberDAO");
			
			response.setContentType("text/html; charset=UTF-8");
			List<MemberVO> member = new ArrayList<MemberVO>();
			request.setAttribute("member", member );
			RequestDispatcher rd = request.getRequestDispatcher("/member/MemberForm.jsp");
			rd.include(request, response);
		}catch (ServletException e) {
			e.printStackTrace();
			request.setAttribute("error", e);
			RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
			
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("error", e);
			
		}
*/
}
	

	//get 방식으로 실행되는 경우 -> 보통 get방식으로 실행된다. 
	//1.웹브라우저 주소창에 URL을 입력한 후 엔터를 누를때
	//2.a 태그로 만들어진 링크를 누를 때
	//3.form의 메소드가 get이거나 생략된 경우
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//post로 명령했을떄만 실행되고 보통 doGet()이 실행된다. 회원가입을 한다면 실행될 코드이다. 
		
		//Connection con = null;
		//PreparedStatement pstmt = null;
		//insert를 할 것이기 때문에 resultSet은 필요하지 않다.
		try {
			
			ServletContext sc = this.getServletContext();
			MemberDAO memberDAO = (MemberDAO)sc.getAttribute("memberDAO");
			
			MemberVO member = (MemberVO)request.getAttribute("member");
			memberDAO.insert(member);
			request.setAttribute("viewUrl", "redirect:list.do");
			/*con = ConnectionPool.getConnection();
			String sql = "insert into members"
					+ "(mno,email,pwd,mname) "+"values(seq_members_mno.nextVal, "
					+ "?,?,? ) ";
			pstmt = con.prepareStatement(sql);
			request.setCharacterEncoding("UTF-8");
			pstmt.setString(1, request.getParameter("email"));	//getParameter의 값은 email값이다. 
			pstmt.setString(2, request.getParameter("password"));
			pstmt.setString(3, request.getParameter("name"));
			pstmt.executeUpdate();				//넣었기 때문에 실행시킨다. 반환값이 없기 때문에 executeUpdate
			
			response.setContentType("text/html; charset=UTF-8");	//실행이 되면 알려줘야 하기 때문에 response실행
			PrintWriter out = response.getWriter();
			out.println("<html><head><title>회원등록결과</title>"
					+ "<meat http-equiv='Refresh' content='2'; url='list'>" + "</head>");
			out.println("<body><p>등록성공!</p></body>");
			
			response.sendRedirect("list");*/
			
			//response.addHeader("Refresh", "1;url=list");	//1초후에 수동으로 list창으로 돌아가지 않고 저절로 돌아가게 만드는 코드
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException();
			
			/*e.printStackTrace();
			request.setAttribute("error", e);
			RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
		}finally {
			System.out.println("닫기시도");
		try {	if(pstmt != null) pstmt.close();	} catch (SQLException e	 ) {
			e.printStackTrace();}
		try {if(pstmt !=null) pstmt.close();} catch (SQLException e ) {
			e.printStackTrace();
		}*/

	}

	}
}
