package com.app.dao;

import java.util.List;

import com.app.model.Agent;

public interface IAgentDao {
	Integer saveAgent(Agent agent);
	void updateAgent(Agent agent);
	void deleteAgent(int id);
	Agent getAgentById(int id);
	List<Agent> getAllAgents();
	List<Agent> getAgentsByStatus(String status);
}
