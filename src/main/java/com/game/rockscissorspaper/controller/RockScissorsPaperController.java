package com.game.rockscissorspaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RockScissorsPaperController {

	@RequestMapping("/")
	public String main_page() {
		return "index.html";
	}

	@RequestMapping("/game")
	public String game_page() {
		return "game.html";
	}
}
