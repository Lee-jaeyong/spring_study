package com.java.ex.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.ex.DAO.UserDAO;

@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;

	public String selectNow() throws Exception {
		return userDAO.selectNow();
	}
}
