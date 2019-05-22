package com.bankof.simba.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HTMLCeptionController {

	@RequestMapping(value = "/err")
	public String except(Model model) {
		model.addAttribute("err", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
		return "error";
	}
}
