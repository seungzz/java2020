package lesson.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//���� Ŭ������ �ݵ�� javax.servlet.Servlet�������̽��� �����ؾ� �Ѵ�.
//���� �����̳ʰ�  ������ ���� ȣ���� �޼ҵ带 ������ ���� Servlet �������̽��̴�.
public class HelloWorld implements Servlet{
	private ServletConfig config;



	//Servlet �������̽��� ���ǵ� 5���� �޼ҵ� �� �����ֱ⿡ ���õ� �޼ҵ�� init()����, service()����, destroy()�Ҹ��̴�.
	@Override
	public void init(ServletConfig config) throws ServletException {
		// ������ ������ �Ŀ� �ʱ�ȭ  �۾��� ���� �����ϴ� �޼ҵ�
		
		System.out.println("init() ȣ���");
		this.config = config;
		
	}
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service() ȣ���");
	}
	
	
	@Override
	public void destroy() {
		System.out.println("destroy() ȣ���");
		//���� �����̳ʰ� ����ǰų� �ش� ������ ��Ȱ��ȭ ��ų�� ����
	}

	@Override
	public ServletConfig getServletConfig() {
		//���� ���� ������ �ٷ�� ServletConfig��ü��ȯ
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	//������ �ۼ��� ����� ����, ���� ���� �Ǹ� ���� ���� ���ڿ��� ��ȯ�Ѵ�.
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
