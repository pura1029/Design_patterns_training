package com.app;

public class RoboticCharging implements RoboticState {

	private Robot robot;

	public RoboticCharging(Robot robot) {
		this.robot = robot;
	}

	@Override
	public void walk() {
		System.out.println("can not walk while charging...");

	}

	@Override
	public void cook() {
		System.out.println("can not cook while charging...");

	}

	@Override
	public void off() {
		System.out.println("switch off...");
		robot.setRoboticState(robot.getRobotOff());
	}

	@Override
	public void charging() {
		System.out.println("charging...");
		
	}

}
