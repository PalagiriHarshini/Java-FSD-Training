package com.test;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;

/**
 * Servlet Filter implementation class MyFilter
 */
@WebFilter("/Login")
public class MyFilter extends HttpFilter  {
       
  
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("fliter destroy()");
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("before servlet");
		chain.doFilter(request, response);
		System.out.println("After servlet");
	}
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("filter init()");
	}

}
