package com.example.androidapp.data.deviceInfo;

public class Television extends Device {

	public int volume;
	public int sleepTimer;
	public int currentChannel;
	
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
