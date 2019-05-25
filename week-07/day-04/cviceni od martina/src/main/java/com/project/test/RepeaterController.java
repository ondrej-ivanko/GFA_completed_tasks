package com.project.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RepeaterController {

	@RequestMapping(value = "/repeater")
	public String getRepeaterPage() {
		return "wordrepeater";
	}

		@RequestMapping(value = "/repeater", method = RequestMethod.POST)
	public String submitToRepeater(Model model, @RequestParam String word, int perParagraph, int lines) {
		model.addAttribute("word", word);
		model.addAttribute("perParagraph", perParagraph);
		model.addAttribute("lines", lines);
		return "wordrepeater";
	}
}
