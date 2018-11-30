package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Admin;
import com.app.model.Agent;
import com.app.model.Company;
import com.app.model.Share;
import com.app.service.IAdminService;
import com.app.service.IAgentService;
import com.app.service.ICompanyService;
import com.app.service.IShareService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private IAdminService service;

	@Autowired
	private ICompanyService companyService;
	
	@Autowired
	private IShareService shareService;
	
	@Autowired
	private IAgentService agentService;
	
	@RequestMapping("/home")
	public String home() {
		return "AdminPage";
	}

	@RequestMapping("/adminnshow")
	public String adminRegister(ModelMap map) {
		map.addAttribute("admin",new Admin() );
		return "AdminRegister";
	}

	@RequestMapping(value="/admininsert",method=RequestMethod.POST)
	public String adminInsert(@ModelAttribute("admin")Admin a,ModelMap map) {


		Integer aId=service.saveAdmin(a);
		map.addAttribute("admin",new Admin());
		String msg="Admin'"+aId+"' Saved";
		map.addAttribute("message", msg);

		return "AdminRegister";	
	}
	@RequestMapping("/adminall")
	public String adminDate(ModelMap map) {
		List<Admin> admins=service.getAllAdmins();
		map.addAttribute("list",admins);
		return "AdminData";
	}
	@RequestMapping("/admindelete")
	public String adminDelete(@RequestParam("id")Integer aId,ModelMap map) {

		service.deleteAdmin(aId);
		String msg="Admin '"+aId+"' Deleted";
		map.addAttribute("message", msg);
		List<Admin> admins=service.getAllAdmins();
		map.addAttribute("list", admins);
		return "AdminData";
	}

	@RequestMapping("/adminedit")
	public String showEdit(@RequestParam("id")Integer aId,ModelMap map) {
		Admin a=service.getOneAdminById(aId);
		map.addAttribute("admin", a);
		return "AdminEdit";
	}

	@RequestMapping(value="/adminupdate",method=RequestMethod.POST)
	public String updateAdmin(@ModelAttribute("admin")Admin a,ModelMap map) {

		service.updateAdmin(a);
		List<Admin> admins=service.getAllAdmins();
		String msg="admin '"+a.getId()+"' updated";
		map.addAttribute("list", admins);
		map.addAttribute("message", msg);

		return "AdminData";
	}
	
	/*<------------------------------------------------------------------------------------------------>*/
	@RequestMapping("/addcompany")
	public String saveCompany(ModelMap map) {
		Company c=new Company();
		map.addAttribute("company",c);
		return "CompanyRegister";
	}
	@RequestMapping(value="/insertcompany",method=RequestMethod.POST)
	public String insertCompany(@ModelAttribute Company company,ModelMap map) {
		companyService.saveCompany(company);
		String msg="company of symbol :'"+company.getCompanySymbol()+"' saved successfull";
		map.addAttribute("msg",msg);
		map.addAttribute("company",new Company());
		return "CompanyRegister";
	}
	
	@RequestMapping("/allcompanies")
	public String data(ModelMap map) {
		List<Company> companies=companyService.getAllCompanies();
		map.addAttribute("companies",companies);
		return "CompanyData";
	}
	
	@RequestMapping("/deletecompany")
	public String delete(@ModelAttribute Company company,ModelMap map) {
		List<Company> companies=companyService.getAllCompanies();
		map.addAttribute("companies",companies);
		return "CompanyDelete";
	}
	
	@RequestMapping("/delete")
	public String deleteCompany(@ModelAttribute Company company,ModelMap map) {
		companyService.deleteCompany(company.getId());
		map.addAttribute("msg","deleted successfully");
		List<Company> companies=companyService.getAllCompanies();
		map.addAttribute("companies",companies);
		return "CompanyDelete";
	}
	
	@RequestMapping("/editcompanies")
	public String update(ModelMap map) {
		List<Company> companies=companyService.getAllCompanies();
		map.addAttribute("companies",companies);
		return "CompanyEdit";
	}
	
	@RequestMapping("/updatecompany")
	public String updateCompany(@RequestParam Integer id,ModelMap map) {
		Company c=companyService.getCompanyById(id);
		map.addAttribute("company",c);
		return "CompanyUpdate";
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update_Company(@ModelAttribute Company company,ModelMap map) {
		companyService.updateCompany(company);
		String msg="company  :'"+company.getCompanyName()+"' updated successfull";
		map.addAttribute("msg",msg);
		List<Company> companies=companyService.getAllCompanies();
		map.addAttribute("companies",companies);
		return "CompanyData";
	}
	
	
	
	/*<-------------------------------------------------------------------------------------------->*/
	@RequestMapping("/addshare")
	public String addShare(ModelMap map) {
		List<Company> companies=companyService.getAllCompanies();
		map.addAttribute("companies",companies);
		map.addAttribute("share",new Share());
		return "ShareRegister";
	}
	
	@RequestMapping(value="/insertshare",method=RequestMethod.POST)
	public String insertShare(@ModelAttribute Share share,ModelMap map) {
		shareService.updateShare(share);
		String msg="Share updated successfull";
		map.addAttribute("msg",msg);
		List<Company> companies=companyService.getAllCompanies();
		map.addAttribute("companies",companies);
		map.addAttribute("share",new Share());
		return "ShareRegister";
	}
	
	@RequestMapping("/allshares")
	public String shareData(ModelMap map) {
		List<Company> companies=companyService.getAllCompanies();
		map.addAttribute("companies",companies);
		return "ShareData";
	}
	
	@RequestMapping("/editshare")
	public String updateShare(ModelMap map) {
		List<Company> companies=companyService.getAllCompanies();
		map.addAttribute("companies",companies);
		map.addAttribute("share",new Share());
		return "ShareEdit";
	}
	@RequestMapping("/updateshare")
	public String updateShare(@ModelAttribute Share share,ModelMap map) {
		Share s=shareService.getShareById(share.getId());
		Company c=companyService.getCompanyById(share.getId());
		String symbol=c.getCompanySymbol();
		map.addAttribute("company",symbol);
		map.addAttribute("sharePrice",s.getSharePrice());
		map.addAttribute("share",s);
		return "ShareUpdate";
	}
	@RequestMapping("/shareupdate")
	public String shareUpdate(@ModelAttribute Share share,ModelMap map) {
		shareService.updateShare(share);
		String msg="Share updated successfull";
		map.addAttribute("msg",msg);
		List<Company> companies=companyService.getAllCompanies();
		map.addAttribute("companies",companies);
		return "ShareData";
	}
	@RequestMapping("/deleteshare")
	public String deleteshare(@ModelAttribute Share share,ModelMap map) {
		List<Company> companies=companyService.getAllCompanies();
		map.addAttribute("companies",companies);
		return "ShareDelete";
	}
	@RequestMapping("/sharedelete")
	public String shareDelete(@ModelAttribute Share share,ModelMap map) {
		/*companyService.deleteCompany(company.getId());*/
		shareService.deleteShare(share.getId());
		map.addAttribute("msg","deleted successfully");
		List<Company> companies=companyService.getAllCompanies();
		map.addAttribute("companies",companies);
		return "ShareData";
	}
	
/*<-------------------------------------------------------------------------------------------------->	*/
	
	@RequestMapping("/approvelAgents")
	public String approvelAgent(ModelMap map) {
		List<Agent> agents=agentService.getAgentsByStatus("no");
		map.addAttribute("agents", agents);
		return "ApprovalAgent";
	}
	
	@RequestMapping("/acceptupdate")
	public String acceptAgent(@RequestParam("id")Integer id,ModelMap map) {
		Agent ac=agentService.getAgentById(id);
		ac.setStatus("yes");
		agentService.updateAgent(ac);
		List<Agent> agents=agentService.getAgentsByStatus("no");
		map.addAttribute("agents", agents);
		return "ApprovalAgent";
	}
	
	@RequestMapping("/rejectupdate")
	public String rejectAgent(@RequestParam("id")Integer id,ModelMap map) {
		Agent ac=agentService.getAgentById(id);
		ac.setStatus("rejected");
		agentService.updateAgent(ac);
		List<Agent> agents=agentService.getAgentsByStatus("no");
		map.addAttribute("agents", agents);
		return "ApprovalAgent";
	}
	
	@RequestMapping("/aceeptedAgents")
	public String acceptedAgent(ModelMap map) {
		List<Agent> agents=agentService.getAgentsByStatus("yes");
		map.addAttribute("agents", agents);
		return "AcceptedAgent";
	}
	
	@RequestMapping("/rejectedAgents")
	public String rejectedAgent(ModelMap map) {
		List<Agent> agents=agentService.getAgentsByStatus("rejected");
		map.addAttribute("agents", agents);
		return "RejectedAgent";
	}
	
	

}
