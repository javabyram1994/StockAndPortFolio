package com.app.service;

import java.util.List;

import com.app.model.Agent;

public interface IAgentService {
	Integer saveAgent(Agent agent);
	void updateAgent(Agent agent);
	void deleteAgent(int id);
	Agent getAgentById(int id);
	List<Agent> getAllAgents();
}
