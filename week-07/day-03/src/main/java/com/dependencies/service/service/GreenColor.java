package com.dependencies.service.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("green")
public class GreenColor implements MyColor {

	Printer printer;

	public GreenColor(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void printColor() {
		printer.log("it is green");
	}
}

