package com.bankof.simba.Controllers;

import com.bankof.simba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class ShowAllAnimalsController {

	List<BankAccount> allAccounts = Arrays.asList(new BankAccount("Monkey Priest", 1500, "monkey"),
			new BankAccount("King", 8900, "lion"),
			new BankAccount("Mother", 600, "lioness"),
			new BankAccount("Piskomil", 350, "piskomil"),
			new BankAccount("Iovara", 50000000, "elf"));

	@GetMapping(value = "/all-of")
	public String giveMeAllAnimals(Model model) {
		model.addAttribute("animals", allAccounts);
		return "animals";
	}

	@GetMapping(value = "/form")
	public String provideForm() {
		return "raisingform";
	}

	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String increaseBalance(@RequestParam String animal) {
		for (BankAccount account : allAccounts) {
			if (account.getName().equals(animal)) {
				account.raiseBalance();
			}
		}
		return "raisingForm";
	}
}
