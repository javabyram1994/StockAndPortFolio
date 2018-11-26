package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IAgentDao;
import com.app.model.Agent;
import com.app.service.IAgentService;
@Service
public class AgentServiceImpl implements IAgentService {
	@Autowired
	private IAgentDao dao;

	@Transactional
	public Integer saveAgent(Agent agent) {
		// TODO Auto-generated method stub
		return dao.saveAgent(agent);
	}

	@Transactional
	public void updateAgent(Agent agent) {
		dao.updateAgent(agent);

	}

	@Transactional
	public void deleteAgent(int id) {
		dao.deleteAgent(id);

	}

	@Transactional(readOnly=true)
	public Agent getAgentById(int id) {
		// TODO Auto-generated method stub
		return dao.getAgentById(id);
	}

	@Transactional(readOnly=true)
	public List<Agent> getAllAgents() {
		// TODO Auto-generated method stub
		return dao.getAllAgents();
	}

}
