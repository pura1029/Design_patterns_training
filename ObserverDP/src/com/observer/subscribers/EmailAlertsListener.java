package com.observer.subscribers;

public class EmailAlertsListener implements EventListener {

	private String email;
	private String message;

	public EmailAlertsListener(String email, String message) {
		this.email = email;
		this.message = message;
	}

	@Override
	public void update(String fileName) {
		System.out.printf(message + " so sending email to %s", fileName, email);
	}

}
