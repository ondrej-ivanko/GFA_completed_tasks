package com.frontend.app.model;

public class Result {

	Integer result;

	public Result(What what) {
		int[] array = what.getArray();
		String action = what.getWhat();
		if (action.equals("sum")) {
			Integer count = 0;
			for (int num : array) {
				count += num;
			}
			this.result = count;
		} if (action.equals("multiply")) {
			Integer count = 0;
			for (int num : array) {
				count *= num;
			}
			this.result = count;
		} if (action.equals("double")) {
			int[] count = new int[array.length];
			for (int num = 0; num < array.length; num++) {
				count[num] = array[num] * 2;
			}
			this.result = count;
		}
	}
}
