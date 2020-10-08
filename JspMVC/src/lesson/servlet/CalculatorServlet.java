package lesson.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


//GenerticServlet은 Servlet 인터페이스를 미리 구현한 클래스로, 굳이 구현할 필요가 많이 없는 쓸데없는 메소드들을 생략하고 반드시 구현해야 하는 
//servlet만을 구현하게 만들어 놓은 클래스이다. 나머지 메소드들은 상황에 따라 구현하지 않아도 괜찮다.   

//@WebServlet("/calc")

public class CalculatorServlet extends GenericServlet{
	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		int a = Integer.parseInt(request.getParameter("a"));
		int b = Integer.parseInt(request.getParameter("b"));
		
		response.setContentType("text/plain");
		//plain = 순수한 text
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter	out = response.getWriter();
		out.println("a="+a+","+"b="+"b의 계산결과입니다.");	//콘솔창에 출력되는 것이 아니라 새롭게  response()로 출력되는것
		out.println("a + b="+(a+b));
		out.println("a - b="+(a-b));
		out.println("a * b="+(a*b));
		out.println("a / b="+(a/b));
		out.println("a % b="+(a%b));




	}

}
