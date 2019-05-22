package com.dependencies.service;

import com.dependencies.service.service.MyColor;
import com.dependencies.service.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ServiceApplication implements CommandLineRunner {

	private MyColor color;
	private MyColor color2;
	private MyColor color3;
	private MyColor color4;

	@Autowired
	public ServiceApplication (@Qualifier("red") MyColor color, @Qualifier("green") MyColor color2, @Qualifier("lime") MyColor color3,
	                           @Qualifier("orange") MyColor color4) {
		this.color = color;
		this.color2 = color2;
		this.color3 = color3;
		this.color4 = color4;
	}

	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		color.printColor();
		color2.printColor();
		/*color3.printColor();
		color4.printColor();*/
	}
}
