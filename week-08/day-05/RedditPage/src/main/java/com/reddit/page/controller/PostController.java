package com.reddit.page.controller;

import com.reddit.page.model.Post;
import com.reddit.page.repository.PostRepository;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PostController {

	@Autowired
	PostRepository postRepository;

	@GetMapping(value = {"", "/"})
	public String showMainPage(Model model) {
		model.addAttribute("posts", postRepository.findAll());
		model.addAttribute("firstTen", postRepository.findPostsByVotesIsNullOrderByVotesDesc());
		return "index";
	}

	@GetMapping("/addpost")
	public String showAddForm(Model model) {
		model.addAttribute("newPost", new Post());
		return "addNewPost";
	}

	@PostMapping("/addpost")
	public String submitPost(@ModelAttribute Post post, @RequestParam Long id) {
		post.setId(id);
		postRepository.save(post);
		return "redirect:/";
	}

	@GetMapping("{id}/upvote")
	public String upvote(@PathVariable Long id) {
		Post post = postRepository.findById(id).get();
		post.upVote();
		postRepository.save(post);
		return "redirect:/";
	}

	@GetMapping("{id}/downvote")
	public String downvote(@PathVariable Long id) {
		Post post = postRepository.findById(id).get();
		post.downVote();
		postRepository.save(post);
		return "redirect:/";
	}

	@GetMapping("{id}/show_content")
	public String contentReveal(@PathVariable Long id, Model model) {
		Post post = postRepository.findById(id).get();
		model.addAttribute("post", post);
		return "postContent";
	}


}
