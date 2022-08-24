package com.demo;

public class MainApp {
	public static void main(String[] args) {

		SingletonDemo dd = SingletonDemo.getObject();
		SingletonDemo dd2 = SingletonDemo.getObject();

		System.out.println(dd.hashCode());
		System.out.println(dd2.hashCode());

	}

}
