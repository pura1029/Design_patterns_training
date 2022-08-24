package com.demo;

public class SingletonDemo implements Cloneable {

	public static SingletonDemo singletonDemo;

	private SingletonDemo() {

	}

	public static synchronized SingletonDemo getObject() {
		if (singletonDemo == null) {
			singletonDemo = new SingletonDemo();
		}
		return singletonDemo;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
