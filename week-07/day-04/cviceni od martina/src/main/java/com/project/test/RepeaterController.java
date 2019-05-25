package com.project.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RepeaterController {

	@RequestMapping(value = "/repeater")
	public String getRepeaterPage(Model model, @RequestParam (required = false) String word,
	                              @RequestParam (required = false) Integer perParagraph,
	                              @RequestParam (required = false) Integer lines) {
		List<String> words = new ArrayList<>();
		for (int line = 0; line < lines; line++) {
			for (int expression = 0; expression < perParagraph; expression++) {
				words.add(word);
			}
		}
		model.addAttribute("word", word);
		model.addAttribute("perParagraph", perParagraph);
		model.addAttribute("lines", lines);
		model.addAttribute("words" ,words);
		return "wordrepeater";
	}

		@RequestMapping(value = "/repeater", method = RequestMethod.POST)
	public String submitToRepeater(Model model, @RequestParam String word,
		                           @RequestParam Integer perParagraph,
		                           @RequestParam Integer lines) {
		model.addAttribute("word", word);
		model.addAttribute("perParagraph", perParagraph);
		model.addAttribute("lines", lines);
		return "redirect:/repeater";
	}
}
