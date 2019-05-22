package com.bankof.simba.Controllers;

import com.bankof.simba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ShowController {

	BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");

	@GetMapping(value="/show")
	public String showAccount(Model model) {
		model.addAttribute("account", bankAccount);
		return "account";
	}
}
