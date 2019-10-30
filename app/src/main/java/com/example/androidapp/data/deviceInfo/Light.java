package com.example.androidapp.data.deviceInfo;

public class Light extends Device{

	//set default values for light device
	public int brightness = 100;
	public String color = "white";

	//constructor sets essential information for light device
	public Light(String name, String location){
		super.name = name;
		super.type = "Light";
		super.location = location;
		Device.numDevices++;
		super.deviceID = numDevices;
	}

	public int getBrightness() {
		return brightness;
	}
	public void setBrightness(int brightness) {
		this.brightness = brightness;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
