package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/homepage/agent")
public class AgentController {
	
	@RequestMapping("/home")
	public String home() {
		return "AgentPage";
	}
	

}
