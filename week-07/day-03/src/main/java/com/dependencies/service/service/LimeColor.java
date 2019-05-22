package com.dependencies.service.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("lime")
public class LimeColor implements MyColor {

	Printer printer;

	public LimeColor(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void printColor() {
		printer.log("it is lime");
	}
}
