package lesson.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


//GenerticServlet�� Servlet �������̽��� �̸� ������ Ŭ������, ���� ������ �ʿ䰡 ���� ���� �������� �޼ҵ���� �����ϰ� �ݵ�� �����ؾ� �ϴ� 
//servlet���� �����ϰ� ����� ���� Ŭ�����̴�. ������ �޼ҵ���� ��Ȳ�� ���� �������� �ʾƵ� ������.   

//@WebServlet("/calc")

public class CalculatorServlet extends GenericServlet{
	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		int a = Integer.parseInt(request.getParameter("a"));
		int b = Integer.parseInt(request.getParameter("b"));
		
		response.setContentType("text/plain");
		//plain = ������ text
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter	out = response.getWriter();
		out.println("a="+a+","+"b="+"b�� ������Դϴ�.");	//�ܼ�â�� ��µǴ� ���� �ƴ϶� ���Ӱ�  response()�� ��µǴ°�
		out.println("a + b="+(a+b));
		out.println("a - b="+(a-b));
		out.println("a * b="+(a*b));
		out.println("a / b="+(a/b));
		out.println("a % b="+(a%b));




	}

}
