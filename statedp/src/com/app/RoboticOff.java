package com.app;

public class RoboticOff implements RoboticState {

	private Robot robot;

	public RoboticOff(Robot robot) {
		super();
		this.robot = robot;
	}

	@Override
	public void walk() {
		robot.setRoboticState(robot.getRobotOn());
		robot.getState().walk();
	}

	@Override
	public void cook() {
		System.out.println("can not cook at state off");

	}

	@Override
	public void off() {
		System.out.println("already switched off");
		robot.setRoboticState(this);
	}

	@Override
	public void charging() {
		System.out.println("charging...");
		robot.setRoboticState(robot.getRoboticCharging());
	}

}
