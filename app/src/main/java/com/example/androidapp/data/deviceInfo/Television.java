package com.example.androidapp.data.deviceInfo;

public class Television extends Device {

	//set default values for TV device
	public int volume = 10;
	public int sleepTimer = -1; //in minutes; -1 for no timer
	public int currentChannel = 1;

	//constructor sets essential information for light device
	public Television(String name, String location){
		super.name = name;
		super.type = "TV";
		super.location = location;
		Device.numDevices++;
		super.deviceID = numDevices;
	}
	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getSleepTimer() {
		return sleepTimer;
	}

	public void setSleepTimer(int sleepTimer) {
		this.sleepTimer = sleepTimer;
	}

	public int getCurrentChannel() {
		return currentChannel;
	}

	public void setCurrentChannel(int newChannel) {
		this.currentChannel = newChannel;
	}

}
