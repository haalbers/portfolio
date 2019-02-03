package com.haley.Portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = "")
	public String home(Model model) {
		return "home";
	}

	@RequestMapping(value = "about")
	public String viewAbout(Model model) {
		return "about";
	}

	@RequestMapping(value = "artwork")
	public String viewArtwork(Model model) {
		return "artwork";
	}
}