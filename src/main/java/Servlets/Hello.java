package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet {
	
	public void doGet(
		HttpServletRequest requisicao,
		HttpServletResponse resposta) throws ServletException , IOException
	{
		PrintWriter out;
		resposta.setContentType("text/html");
		out = resposta.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlets - Hello World!</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>Primeira página com Servlet</h2>");
		out.println("<p>Hello, World!</p>");
		out.println("</body>");
		out.println("</html>");
	}
}