package com.dbHelper;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;

@Service
public class dbService {
	//@Transactional
	public boolean insert(User user) {
		boolean flag = false;
		UserFacade iUserFacade = new UserFacade();
		flag = iUserFacade.insert(user);
		return flag;
	}
}
