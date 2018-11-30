package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.Agent;
import com.app.service.IAgentService;

@Controller
@RequestMapping("/homepage/agent")
public class AgentController {
	@Autowired
	private IAgentService agentService;

	@RequestMapping("/home")
	public String home() {
		return "AgentPage";
	}

	/*//agent register
	@RequestMapping("/agentregister")
	public String agentShow(ModelMap map) {
		map.addAttribute("agent",new Agent());
		return "AgentRegister";
	}
	//agent data insert
	@RequestMapping(value="/agentinsert",method=RequestMethod.POST)
	public String agentInsert(@ModelAttribute Agent agent,ModelMap map) {
		agentService.saveAgent(agent);
		String msg="Agent saved successfully";
		map.addAttribute("msg",msg);
		return "AgentLogin";
	}*/


}
