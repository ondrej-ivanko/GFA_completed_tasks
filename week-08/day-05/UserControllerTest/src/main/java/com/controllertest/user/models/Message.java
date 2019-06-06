package com.controllertest.user.models;

public class Message {

	private String received;
	private String translated;

	public Message(String msg) {
		this.received = msg;
		this.translated = "I am groot";
	}

	public String getReceived() {
		return received;
	}

	public void setReceived(String received) {
		this.received = received;
	}

	public String getTranslated() {
		return translated;
	}

	public void setTranslated(String translated) {
		this.translated = translated;
	}
}
