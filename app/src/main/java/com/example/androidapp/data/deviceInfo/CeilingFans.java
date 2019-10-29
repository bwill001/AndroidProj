package com.example.androidapp.data.deviceInfo;

public class CeilingFans extends Device{
	
	public int speed; //0-3 for off and low-high
	public int direction; //-1 for counterclockwise, 1 for clockwise
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getDirection() {
		return direction;
	}
	public void setDirection(int direction) {
		this.direction = direction;
	}	
}
