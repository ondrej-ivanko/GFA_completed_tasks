package com.yondus.arrow.models;

public class Arrow {

	String distance;
	String time;
	String speed;

	public Arrow(String distance, String time) {
		this.distance = distance;
		this.time = time;
		float speed = Float.parseFloat(distance) / Float.parseFloat(time);
		this.speed = String.valueOf(speed);
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}
}
