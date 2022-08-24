package com.observer.client;

import com.observer.publisher.Editor;
import com.observer.subscribers.EmailAlertsListener;
import com.observer.subscribers.EventManager;
import com.observer.subscribers.LoggingListener;

public class Application {

	public void config() {
		EventManager eventManager = new EventManager();
		Editor editor = new Editor(eventManager);
		LoggingListener loggingListener = new LoggingListener("/path/to/log.txt", "Someone has opened the file: %s");
		eventManager.subscribe("open", loggingListener);

		EmailAlertsListener emailAlerts = new EmailAlertsListener("admin@example.com",
				"Someone has changed the file: %s");
		eventManager.subscribe("save", emailAlerts);

		editor.openFile("/path/to/log.txt");
		editor.saveFile();
	}

	public static void main(String[] args) {

		new Application().config();
	}

}
