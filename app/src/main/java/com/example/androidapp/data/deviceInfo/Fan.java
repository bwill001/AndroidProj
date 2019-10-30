package com.example.androidapp.data.deviceInfo;

public class Fan extends Device{

	//set default values for speed and direction
	public int speed = 2; //0-3 for off-low-med-high
	public int direction = -1; //-1 for counterclockwise, 1 for clockwise

	//constructor sets essential information for fan device
	public Fan(String name, String location){
		super.name = name;
		super.type = "Fan";
		super.location = location;
		Device.numDevices++;
		super.deviceID = numDevices;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;

		if(speed == 0){
			super.isOn = false;
		}
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}	
}
