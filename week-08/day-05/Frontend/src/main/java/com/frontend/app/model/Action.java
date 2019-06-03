package com.frontend.app.model;

public class Action {

	Integer result;

	public Action(int num, String result) {
		if (result.equals("sum")) {
			this.result = summer(num);
		} if (result.equals("factorial")) {
			this.result = factorial(num);
		}
	}

	public Integer factorial(int num) {
		if (num <= 1) {
			return  num;
		}
		return num * factorial(num - 1);
	}

	public Integer summer(int num) {
		if (num <= 1) {
			return  num;
		}
		return num + factorial(num - 1);
	}

	public Integer getUntil() {
		return result;
	}

	public void setUntil(Integer result) {
		this.result = result;
	}
}
