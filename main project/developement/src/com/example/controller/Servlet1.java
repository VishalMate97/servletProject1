package com.example.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.example.service.*;
import java.util.*;

public class Servlet1 extends HttpServlet {
 public void doPost(HttpServletRequest request,
	HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Beer Selection Advice<br>");
		String c = request.getParameter("color") != null ? 
			request.getParameter("color") : "N/A";
		out.println("<br>Got beer color " + c);
		
		
		BeerAdvice bObj = new BeerAdvice();
		
		List data = bObj.getBrands(c);
		
		Iterator itr = data.iterator();
		
		while(itr.hasNext()){
			out.println("try " + itr.next());
		}
		
		
		
	}
}