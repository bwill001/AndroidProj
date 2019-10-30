package com.example.androidapp.data.deviceInfo;

public class Device {

		public String name;
		public int deviceID;
		public String type;
		public String location;
		public boolean isOn;
		public String status;
		static int numDevices;
		
		
		public Device() {
		}

		/**
		 * Creates a new IoT device.
		 * @param name custom identifier name for device
		 * @param type type of device (i.e. fan, light, tv, or thermostat)
		 * @param location location in building of device
		 */
		public void addDevice(String name, String type, String location) {
			this.name = name;
			this.type = type;
			this.location = location;
			Device.numDevices++;
			this.deviceID = numDevices;
		}
		
		public void resetDevice() {
			this.name = null;
			this.type = null;
			this.location = null;
			//this.status = null;
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getDeviceID() {
			return deviceID;
		}

		public void setDeviceID(int deviceID) {
			this.deviceID = deviceID;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public boolean isOn() {
			return isOn;
		}

		public void setOn(boolean isOn) {
			this.isOn = isOn;
		}

		 public String getStatus() {
			return status;
		}

		 public void setStatus(String status) {

			this.status = status;
		}

		public static int getNumDevices() {
			return numDevices;
		}

		public static void setNumDevices(int numDevices) {
			Device.numDevices = numDevices;
		}
}
