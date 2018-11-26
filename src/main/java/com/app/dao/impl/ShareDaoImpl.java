package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IShareDao;
import com.app.model.Share;
@Repository
public class ShareDaoImpl implements IShareDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveShare(Share share) {
		return (Integer) ht.save(share);
	}

	@Override
	public void updateShare(Share share) {
		ht.update(share);
	}

	@Override
	public void deleteShare(int id) {
		Share s=new Share();
		s.setId(id);
		ht.delete(s);
	}

	@Override
	public Share getShareById(int id) {
		return ht.get(Share.class, id);
	}

	@Override
	public List<Share> getAllShares() {
		return ht.loadAll(Share.class);
	}

}
