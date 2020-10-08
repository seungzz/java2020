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
		// service()�� �ϴ� ������ �Ѵ�.
		/*@Override	response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>ȸ������</title></head>");
		out.println("<body><h1>ȸ�����</h1>");
		out.println("<form action ='add' method='post'>");
		out.println("�̸�: <input type ='text' name='name'><br>");
		out.println("�̸���: <input type ='text' name='email'><br>");
		out.println("��ȣ: <input type ='password' name='password'><br>");
		out.println("<input type ='submit' value='�߰�'>");
		out.println("<input type ='reset' value='���'><br>");
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
	

	//get ������� ����Ǵ� ��� -> ���� get������� ����ȴ�. 
	//1.�������� �ּ�â�� URL�� �Է��� �� ���͸� ������
	//2.a �±׷� ������� ��ũ�� ���� ��
	//3.form�� �޼ҵ尡 get�̰ų� ������ ���
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//post�� ����������� ����ǰ� ���� doGet()�� ����ȴ�. ȸ�������� �Ѵٸ� ����� �ڵ��̴�. 
		
		//Connection con = null;
		//PreparedStatement pstmt = null;
		//insert�� �� ���̱� ������ resultSet�� �ʿ����� �ʴ�.
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
			pstmt.setString(1, request.getParameter("email"));	//getParameter�� ���� email���̴�. 
			pstmt.setString(2, request.getParameter("password"));
			pstmt.setString(3, request.getParameter("name"));
			pstmt.executeUpdate();				//�־��� ������ �����Ų��. ��ȯ���� ���� ������ executeUpdate
			
			response.setContentType("text/html; charset=UTF-8");	//������ �Ǹ� �˷���� �ϱ� ������ response����
			PrintWriter out = response.getWriter();
			out.println("<html><head><title>ȸ����ϰ��</title>"
					+ "<meat http-equiv='Refresh' content='2'; url='list'>" + "</head>");
			out.println("<body><p>��ϼ���!</p></body>");
			
			response.sendRedirect("list");*/
			
			//response.addHeader("Refresh", "1;url=list");	//1���Ŀ� �������� listâ���� ���ư��� �ʰ� ������ ���ư��� ����� �ڵ�
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException();
			
			/*e.printStackTrace();
			request.setAttribute("error", e);
			RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
		}finally {
			System.out.println("�ݱ�õ�");
		try {	if(pstmt != null) pstmt.close();	} catch (SQLException e	 ) {
			e.printStackTrace();}
		try {if(pstmt !=null) pstmt.close();} catch (SQLException e ) {
			e.printStackTrace();
		}*/

	}

	}
}
