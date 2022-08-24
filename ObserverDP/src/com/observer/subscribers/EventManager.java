package com.observer.subscribers;

import java.util.HashMap;
import java.util.Map;

public class EventManager {

	private Map<String, EventListener> listeners;

	public EventManager() {
		listeners = new HashMap<>();
	}

	public void subscribe(String eventType, EventListener eventListener) {
		listeners.put(eventType, eventListener);
	}

	public void unsubscribe(String eventType, EventListener eventListener) {
		listeners.remove(eventType, eventListener);
	}

	public void notify(String eventType, String fileName) {
		EventListener eventListener = listeners.get(eventType);
		if (eventListener != null) {
			eventListener.update(fileName);
		}
	}
}
