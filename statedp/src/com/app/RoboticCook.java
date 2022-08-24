package com.app;

public class RoboticCook implements RoboticState {

	private Robot robot;

	public RoboticCook(Robot robot) {
		this.robot = robot;
	}

	@Override
	public void walk() {
		System.out.println("walking...");
		robot.setRoboticState(robot.getRobotOn());
	}

	@Override
	public void cook() {
		System.out.println("cooking....");
		robot.setRoboticState(robot.getRoboticCook());
	}

	@Override
	public void off() {
		System.out.println("can not switch off while cooking...");

	}
	
	@Override
	public void charging() {
		System.out.println("charging...");
		robot.setRoboticState(robot.getRoboticCharging());
	}

}
