import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wso2.com.Authenticator;


public class MyServlet extends HttpServlet{
	
	protected  void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		if(request.getRequestURI().endsWith("/home.jsp")){
			String uName = Authenticator.verify(request.getParameter("sig_response"));
			
			// Set response content type
		      response.setContentType("text/html");

		      PrintWriter out = response.getWriter();
			  String title = "Auth Success";
		      String docType =
		      "<!doctype html public \"-//w3c//dtd html 4.0 " +
		      "transitional//en\">\n";
		      out.println(docType +
		                "<html>\n" +
		                "<head><title>" + title + "</title></head>\n" +
		                "<body bgcolor=\"#f0f0f0\">\n" +
		                "<h1> Welcome "+uName+"!!!</h1>"+
		                "</body></html>");
		}
		
//		
//		if(request.getRequestURI().endsWith("/duoAuth.jsp")){
//			String uName = request.getParameter("uname");
//			String psw = request.getParameter("password");
//			
//			response.setContentType("text/html");
//
//		      PrintWriter out = response.getWriter();
//			  String title = "Creation Success";
//		      String docType =
//		      "<!doctype html public \"-//w3c//dtd html 4.0 " +
//		      "transitional//en\">\n";
//		      out.println(docType +
//		                "<html>\n" +
//		                "<head><title>" + title + "</title></head>\n" +
//		                "<body bgcolor=\"#f0f0f0\">\n" +
//		                "<h2>"+uName+"</h2>"+
//		                "</body></html>");
//			
//			request.setAttribute("uname", uName);
//			request.setAttribute("password", psw);
//			
//			request.getRequestDispatcher("/duoAuth.jsp").include(request, response);
//		}
    }

}
