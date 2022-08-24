package com.model;

import java.util.ArrayList;
import java.util.List;

import com.controller.Interest;
import com.controller.Observer;

public class Client {

	private Observer obs;
	private List<Interest> interests;

	public void addInterest(Interest its) {
		if (interests == null)
			interests = new ArrayList<>();
		interests.add(its);
	}

	public Client(Observer obs) {
		this.obs = obs;
	}

	public void removeInterest(Interest interest) {
		interests.remove(interest);
	}

	public boolean hasInterests(Interest interest) {
		return interests.contains(interest);
	}

	public Observer getObs() {
		return obs;
	}

	public void setObs(Observer observer) {
		this.obs = observer;
	}

}
