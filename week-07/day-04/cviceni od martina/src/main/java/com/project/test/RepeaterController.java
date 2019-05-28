package com.project.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RepeaterController {

	@GetMapping(value = "/repeater")
	public String getRepeaterPage(Model model, @RequestParam (required = false) List<String> words) {
		model.addAttribute("words", words);
		return "wordrepeater";
	}

	@PostMapping(value = "/repeater")
	public String  submitToRepeater(Model model, @RequestParam String word,
	                                     @RequestParam Integer perParagraph,
	                                     @RequestParam Integer lines) {
		List<String> words = new ArrayList<>();
		for (int line = 0; line < lines; line++) {
			for (int expression = 0; expression < perParagraph; expression++) {
				words.add(word);
			}
		}
		model.addAttribute("words", words);
		return "redirect:/repeater";
	}
}
