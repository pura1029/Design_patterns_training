package com.observer.publisher;

import java.io.File;

import com.observer.subscribers.EventManager;

public class Editor {

	private EventManager eventManager;

	private File file;

	public Editor(EventManager eventManager) {
		super();
		this.eventManager = eventManager;
	}

	public void openFile(String filePath) {
		this.file = new File(filePath);
		eventManager.notify("open", file.getName());
	}

	public void saveFile() {
		System.out.println("saveFile");
		eventManager.notify("save", file.getName());
	}
}
