package com.observer.subscribers;

import java.io.File;

public class LoggingListener implements EventListener {

	private File log;
	private String message;

	public LoggingListener(String filePath, String message) {
		this.log = new File(filePath);
		this.message = message;
	}

	@Override
	public void update(String fileName) {
		System.out.printf(message, fileName);
		System.out.println();
	}

}
