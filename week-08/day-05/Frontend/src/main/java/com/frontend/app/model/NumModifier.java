package com.frontend.app.model;

public class NumModifier {

	Integer result;

	public NumModifier(Until until, String action) {
		if (action.equals("factorial")) {
			this.result = 1;
			for (int i = 0; i < until.getUntil() - 1; i++) {
				this.result *= until.getUntil() - i;
			}
		} else if (action.equals("sum")) {
			this.result = 0;
			for (int i = 0; i < until.getUntil(); i++) {
				this.result += until.getUntil() - i;
			}
		}
	}
}
