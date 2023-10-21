package com.sellas.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("default")
	public String gogo() {
		return "default";
	}	
	
	@GetMapping("help")
	public String help() {
		return "help";
	}
	
}
