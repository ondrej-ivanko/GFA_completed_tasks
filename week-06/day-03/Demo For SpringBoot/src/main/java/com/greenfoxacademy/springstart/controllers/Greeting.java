package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

	private static AtomicLong id = new AtomicLong();
	String content;
	static String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
			"Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
			"Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
			"Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

	public Greeting(String content) {
		this.content = content;
		id.incrementAndGet();
	}

	public String loopThroughHellos() {
		for (String hello : hellos) {
			return hello;
		}
		return null;
	}

	public String[] getHellos() {
		return hellos;
	}

	public AtomicLong getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public String toString() {
		return getHellos().toString();
	}
}
