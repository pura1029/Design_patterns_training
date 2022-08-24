/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.controller;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.commands.Command;
import com.db.ProductsDB;
import com.factories.BeansFactory;
import com.model.Product;

public class FrontControllerServlet extends HttpServlet {
	ApplicationController manager;
	private ProductsDB db;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		db = new ProductsDB();
		getServletContext().setAttribute("db", db);
		InputStream ecfile = getServletContext().getResourceAsStream(config.getInitParameter("ecfile"));
		InputStream vcfile = getServletContext().getResourceAsStream(config.getInitParameter("vcfile"));
		InputStream bcfile = getServletContext().getResourceAsStream(config.getInitParameter("bcfile"));

		System.out.println(ecfile + " " + vcfile + " " + bcfile);
		manager = new ApplicationController(ecfile, vcfile);
		BeansFactory.createBeans(bcfile);
	}

	private <T> void populateBean(Class<T> c1, Object o1, HttpServletRequest request) {
		BeanInfo info;
		try {
			info = Introspector.getBeanInfo(c1);
			PropertyDescriptor[] pds = info.getPropertyDescriptors();
			Enumeration e = request.getParameterNames();
			while (e.hasMoreElements()) {
				Method setMethod = null;
				String fieldName = (String) e.nextElement();
				System.out.println("field:" + fieldName);
				String fieldValue = request.getParameter(fieldName);
				System.out.println("value:" + fieldValue);
				for (PropertyDescriptor pd : pds) {
					setMethod = null;

					if (pd.getName().equalsIgnoreCase(fieldName)) {
						setMethod = pd.getWriteMethod();
						setMethod.invoke(o1, fieldValue);

						break;
					}

				}
			}
			Enumeration e2 = request.getAttributeNames();
			System.out.println("In populate bean");
			while (e2.hasMoreElements()) {
				System.out.println("In populate bean inside");
				Method setMethod = null;
				String fieldName = (String) e2.nextElement();
				System.out.println("field:" + fieldName);
				Object fieldValue = request.getAttribute(fieldName);
				System.out.println("value:" + fieldValue);
				for (PropertyDescriptor pd : pds) {
					setMethod = null;
					System.out.println("In populate bean inside:prpdes");
					if (pd.getName().equalsIgnoreCase(fieldName)) {

						setMethod = pd.getWriteMethod();
						System.out.println("In populate bean inside:" + setMethod);
						setMethod.invoke(o1, fieldValue);

						break;
					}

				}
			}

			System.out.println(o1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		try {

			String url = request.getRequestURL().toString();
			System.out.println("url:" + url);
			int lastSlash = url.lastIndexOf("/");
			int lasturi = url.lastIndexOf(".do");
			String actualPath = url.substring(lastSlash + 1, lasturi);
			System.out.println("actualpath now:" + actualPath);

			if (actualPath.equals("list")) {
				ArrayList<Product> pl = (ArrayList<Product>) db.getProductList();
				request.setAttribute("prd_list", pl);
			}

			// login bean and list bean will be found here and assigned to command
			Command c = BeansFactory.getBean(actualPath);

			// bean properties will be set here
			populateBean(BeansFactory.getClass(actualPath), c, request);

			// Control goes to Application Controller here and controller will execute
			// proper action
			String forward = manager.process(actualPath, c);

			System.out.println("forward:" + forward);
			RequestDispatcher rd = request.getRequestDispatcher(forward);
			rd.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
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

	@Override
	public String getServletInfo() {
		return "Short description";
	}// </editor-fold>

}