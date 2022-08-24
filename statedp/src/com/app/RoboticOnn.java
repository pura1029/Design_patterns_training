package com.app;

public class RoboticOnn implements RoboticState {

	private Robot robot;

	public RoboticOnn(Robot robot) {
		this.robot = robot;
	}

	@Override
	public void walk() {
		System.out.println("Walking...");
		robot.setRoboticState(robot.getRobotOn());
	}

	@Override
	public void cook() {
		System.out.println("cooking..");
		robot.setRoboticState(robot.getRoboticCook());

	}

	@Override
	public void off() {
		System.out.println("robot is swirtched off");
		robot.setRoboticState(robot.getRobotOff());
	}

	@Override
	public void charging() {
		System.out.println("charging...");
		robot.setRoboticState(robot.getRoboticCharging());
	}

}
