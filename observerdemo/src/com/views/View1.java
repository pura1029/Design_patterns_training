package com.views;

import com.controller.Interest;
import com.controller.Observer;
import com.controller.Subject;

//Subscriber
public class View1 implements Observer {

	Subject subject;

	public View1(Subject subject) {
		this.subject = subject;
		subject.register(this);
	}

	@Override
	public void update(String msg) {
		System.out.println(msg);

	}

	@Override
	public void addInterest(Interest interest) {
		subject.addInterest(this, interest);

	}

	@Override
	public void removeInterest(Interest interest) {
		subject.removeInterest(this, interest);
	}

}
