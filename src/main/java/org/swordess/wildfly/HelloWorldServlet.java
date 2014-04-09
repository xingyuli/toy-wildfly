package org.swordess.wildfly;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/helloworld")
public class HelloWorldServlet extends HttpServlet {

	@Inject
	private HelloService helloService;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.println("<html><body>");
		writer.println(helloService.sayHello("Vic"));
		writer.println("</body></html>");
		writer.flush();
	}
	
}
