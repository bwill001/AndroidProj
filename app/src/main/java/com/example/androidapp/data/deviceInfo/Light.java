package com.example.androidapp.data.deviceInfo;

public class Light extends Device{

	public int brightness;
	public String color;
	
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
