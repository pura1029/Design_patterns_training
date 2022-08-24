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

import com.commands.Command;

/**
 * 
 * @author mohan
 */
public class BeansFactory {
	private static Properties beansProps = new Properties();

	public static void createBeans(InputStream stream) {

		try {
			beansProps.load(stream);
		} catch (IOException ex) {
			Logger.getLogger(BeansFactory.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public static Class getClass(String key) {
		try {
			return Class.forName(beansProps.getProperty(key));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Command getBean(String key) {
		try {
			Command ex = (Command) (Class.forName(beansProps.getProperty(key)).newInstance());
			return ex;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
