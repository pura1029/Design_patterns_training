package com.controller;
//Publisher
public interface Subject {

	public void register(Observer obs);

	public void addInterest(Observer observer, Interest interest);

	public void removeInterest(Observer observer, Interest interest);

	public void update(double roi, Interest interest);

	public void unregister(Observer observer);

}
