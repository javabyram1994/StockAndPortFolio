package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.Agent;
import com.app.model.Customer;
import com.app.service.IAgentService;
import com.app.service.ICustomerService;

@Controller
@RequestMapping("/homepage")
public class HomeController {
	@Autowired
	private IAgentService agentService;
	@Autowired
	private ICustomerService customerService;

	//home page
	@RequestMapping("/home")
	public String home() {
		return "HomePage";
	}

	//admin login
	@RequestMapping("/adminlogin")
	public String adminLogin() {
		return "AdminLogin";
	}

	//agent login
	@RequestMapping("/agentlogin")
	public String agentLogin(ModelMap map) {
		return "AgentLogin";
	}
	//agent register
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
	}

	//customer login
	@RequestMapping("/customerlogin")
	public String customerLogin() {
		return "CustomerLogin";
	}
	//customer registration
	@RequestMapping("/customerregister")
	private String customerShow(ModelMap map) {
		map.addAttribute("customer",new Customer());
		return "CustomerRegister";
	}
	//customer data insert
	@RequestMapping(value="/customerinsert",method=RequestMethod.POST)
	private String customerinsert(@ModelAttribute Customer customer,ModelMap map) {
		customerService.saveCustomer(customer);
		String msg="Agent saved successfully";
		map.addAttribute("msg",msg);
		return "CustomerLogin";
	}
	
}
