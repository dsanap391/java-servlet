package com.ds;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HttpServletExample extends HttpServlet{
	private String mymsg;
	public void init() {
		mymsg="Http servlet Demo";
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.print("<h1>"+mymsg+"</h1>");
		pw.print("<p>"+"Hello Friends!"+"</p>");
	}
	public void destroy() {
		
	}
 }