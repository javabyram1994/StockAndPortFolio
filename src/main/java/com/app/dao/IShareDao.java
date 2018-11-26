package com.app.dao;

import java.util.List;

import com.app.model.Share;

public interface IShareDao {
	Integer saveShare(Share share);
	void updateShare(Share share);
	void deleteShare(int id);
	Share getShareById(int id);
	List<Share> getAllShares();

}
