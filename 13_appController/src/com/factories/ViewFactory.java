/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.factories;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author mohan
 */
public class ViewFactory {
	private static Properties viewerProps = new Properties();
	private static InputStream viewStream;

	public static void createViews(InputStream stream) {
		viewStream = stream;
		try {
			viewerProps.load(viewStream);

		} catch (IOException ex) {
			Logger.getLogger(ExecutorFactory.class.getName()).log(Level.SEVERE,
					null, ex);
		}
	}

	public static String getView(String key) {
		String ex = null;
		try {
			ex = (String) viewerProps.get(key);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return ex;
	}
}