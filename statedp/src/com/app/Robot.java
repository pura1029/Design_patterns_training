package com.app;

public class Robot implements RoboticState {

	private RoboticState robotOn;
	private RoboticState robotOff;
	private RoboticState roboticCook;
	private RoboticState roboticCharging;

	private RoboticState state;

	public Robot() {
		this.robotOn = new RoboticOnn(this);
		this.robotOff = new RoboticOff(this);
		this.roboticCook = new RoboticCook(this);
		this.roboticCharging = new RoboticCharging(this);
		this.state = robotOn;
	}

	public void setRoboticState(RoboticState state) {
		this.state = state;
	}

	@Override
	public void walk() {
		state.walk();

	}

	@Override
	public void cook() {
		state.cook();
	}

	@Override
	public void off() {
		state.off();

	}

	@Override
	public void charging() {
		state.charging();
	}

	public RoboticState getRobotOn() {
		return robotOn;
	}

	public void setRobotOn(RoboticState robotOn) {
		this.robotOn = robotOn;
	}

	public RoboticState getRobotOff() {
		return robotOff;
	}

	public void setRobotOff(RoboticState robotOff) {
		this.robotOff = robotOff;
	}

	public RoboticState getRoboticCook() {
		return roboticCook;
	}

	public void setRoboticCook(RoboticState roboticCook) {
		this.roboticCook = roboticCook;
	}

	public RoboticState getState() {
		return state;
	}

	public void setState(RoboticState state) {
		this.state = state;
	}

	public RoboticState getRoboticCharging() {
		return roboticCharging;
	}

	public void setRoboticCharging(RoboticState roboticCharging) {
		this.roboticCharging = roboticCharging;
	}

}
