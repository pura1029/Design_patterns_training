/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.commands.LoginCommand;
import com.commands.RegisterCommand;
import com.executors.LoginExecutor;
import com.executors.RegistrationExecutor;

public class FrontControllerServlet extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		String url = request.getRequestURL().toString();
		int lastSlash = url.lastIndexOf("/");
		int lasturi = url.lastIndexOf(".do");
		String actualPath = url.substring(lastSlash + 1, lasturi);

		if (actualPath.equals("login")) {
			LoginCommand c = new LoginCommand();
			String userName = request.getParameter("u1");
			String password = request.getParameter("u2");
			c.setUsername(userName);
			c.setPassword(password);
			LoginExecutor le = new LoginExecutor();
			String s = le.execute(c);
			request.getRequestDispatcher(s).forward(request, response);
		} else if (actualPath.equals("registration")) {
			RegisterCommand c = new RegisterCommand();
			String userName = request.getParameter("u1");
			String password = request.getParameter("u2");
			c.setUsername(userName);
			c.setPassword(password);
			RegistrationExecutor le = new RegistrationExecutor();
			String s = le.execute(c);
			request.getRequestDispatcher(s).forward(request, response);
		}
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

}
