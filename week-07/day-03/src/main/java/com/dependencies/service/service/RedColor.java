package com.dependencies.service.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("red")
public class RedColor implements MyColor {

	Printer printer;

	public RedColor(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void printColor() {
		printer.log("it is red.");
	}
}
