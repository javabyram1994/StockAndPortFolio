package com.app.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IAgentDao;
import com.app.model.Agent;
@Repository
public class AgentDaoImpl implements IAgentDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveAgent(Agent agent) {
		// TODO Auto-generated method stub
		return (Integer) ht.save(agent);
	}

	@Override
	public void updateAgent(Agent agent) {
		ht.update(agent);

	}

	@Override
	public void deleteAgent(int id) {
		Agent a=new Agent();
		a.setId(id);
		ht.delete(a);

	}

	@Override
	public Agent getAgentById(int id) {
		// TODO Auto-generated method stub
		return ht.get(Agent.class, id);
	}

	@Override
	public List<Agent> getAllAgents() {
		// TODO Auto-generated method stub
		return ht.loadAll(Agent.class);
	}

	@Override
	public List<Agent> getAgentsByStatus(String status) {
		@SuppressWarnings("unchecked")
		List<Agent> agents= (List<Agent>) ht.findByCriteria(DetachedCriteria.forClass(Agent.class)
		.add(Restrictions.eq("status", status)));
		return agents;
	}

}
