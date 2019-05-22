package com.dependencies.service.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("orange")
public class OrangeColor implements MyColor {

	Printer printer;

	public OrangeColor(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void printColor() {
		printer.log("it is orange");
	}
}
