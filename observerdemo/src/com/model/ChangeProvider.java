package com.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.controller.Interest;
import com.controller.Observer;
import com.controller.Subject;
//Publisher
public class ChangeProvider implements Subject {

	private List<Client> clients;
	private Map<Interest, Double> interests;

	public ChangeProvider() {
		clients = new ArrayList<>();
		interests = new HashMap<>();
	}

	@Override
	public void register(Observer obs) {
		clients.add(new Client(obs));
	}

	@Override
	public void addInterest(Observer observer, Interest interest) {
		for (Client c : clients) {
			if (c.getObs().equals(observer)) {
				c.addInterest(interest);
			}

		}

	}

	@Override
	public void removeInterest(Observer observer, Interest interest) {
		for (Client c : clients) {
			if (c.getObs().equals(observer)) {
				c.removeInterest(interest);
			}

		}
	}

	@Override
	public void update(double roi, Interest interest) {
		interests.put(interest, roi);
		notifyAll(interest);

	}

	void notifyAll(Interest interest) {
		for (Client c : clients) {
			if (c.hasInterests(interest))
				c.getObs().update("" + interest + " updated");
		}
	}

	@Override
	public void unregister(Observer observer) {
		Iterator<Client> iterator = clients.iterator();
		while (iterator.hasNext()) {
			Client client = iterator.next();
			if (client.getObs() == observer) {
				iterator.remove();
				break;
			}
		}

	}

}
