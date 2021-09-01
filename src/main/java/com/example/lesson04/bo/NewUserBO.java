package com.example.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson04.dao.NewUserDAO;

@Service
public class NewUserBO {

	@Autowired
	private NewUserDAO newUserDAO;
	
	public int addNewUserAsField(String name, String yyyymmdd, String email, String introduce) {
		return newUserDAO.insertNewUserAsField(name, yyyymmdd, email, introduce);
	}
}
