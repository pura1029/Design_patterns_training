package com.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TimeFilter implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		long st, et;

		st = System.currentTimeMillis();
		System.out.println("Time before " + st);

		chain.doFilter(request, response);

		et = System.currentTimeMillis();
		System.out.println("Time-2 " + et);

		System.out.println("Total Time taken " + (et - st));

	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
