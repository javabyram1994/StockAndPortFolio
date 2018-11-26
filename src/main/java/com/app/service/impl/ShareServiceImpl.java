package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IShareDao;
import com.app.model.Share;
import com.app.service.IShareService;
@Service
public class ShareServiceImpl implements IShareService{
	@Autowired
	private IShareDao dao;

	@Transactional
	public Integer saveShare(Share share) {
		return dao.saveShare(share);
	}

	@Transactional
	public void updateShare(Share share) {
		dao.updateShare(share);
	}

	@Transactional
	public void deleteShare(int id) {
		dao.deleteShare(id);
	}

	@Transactional(readOnly=true)
	public Share getShareById(int id) {
		return dao.getShareById(id);
	}

	@Transactional(readOnly=true)
	public List<Share> getAllShares() {
		return dao.getAllShares();
	}

}
