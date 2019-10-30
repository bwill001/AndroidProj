package com.example.androidapp.data.deviceInfo;

public class Thermostat extends Device{

	//set default values for thermostat device
	double temp = 72.0;
	boolean cool = false;
	boolean heat = false;

	//constructor only sets essential information for thermostat device
	public Thermostat(String name, String location){
		super.name = name;
		super.type = "Thermostat";
		super.location = location;
		Device.numDevices++;
		super.deviceID = numDevices;
	}

	public boolean getCool() {
		return this.cool;
	}

	public void setCool(boolean onCool) {
		this.cool = onCool;

		if(onCool){
			this.setHeat(false);
		}
	}

	public boolean getHeat() {
		return this.heat;
	}

	public void setHeat(boolean onHeat) {
		this.heat = onHeat;

		if(onHeat){
			this.setCool(false);
		}
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}
		
}
