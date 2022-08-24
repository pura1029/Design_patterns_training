package com.controller;

//Subscriber
public interface Observer {
	public void update(String msg);

	public void addInterest(Interest interest);

	public void removeInterest(Interest interest);
}
