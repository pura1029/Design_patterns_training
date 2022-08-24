/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.factories;

import com.executors.Executor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author mohan
 */
public class ExecutorFactory {
	private static Properties executorProps = new Properties();
	private static InputStream executorStream;

	public static void createExcecutors(InputStream stream) {
		executorStream = stream;
		try {
			executorProps.load(stream);
			executorProps.put("login", "com.executors.LoginExecutor");

		} catch (IOException ex) {
			Logger.getLogger(ExecutorFactory.class.getName()).log(Level.SEVERE,
					null, ex);
		}
	}

	public static Executor getExecutor(String key) {
		try {
			Executor ex = (Executor) (Class.forName(executorProps
					.getProperty(key)).newInstance());
			return ex;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
