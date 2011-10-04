package com.assignment1.controller;

import com.assignment1.model.UserModel;

public class UserController {
	UserModel userModel;
	
	public UserController()
	{
		userModel=new UserModel();
	}
	
	public boolean login(String username, String password)
	{
		//TODO Vai levar threads aqui!
		return userModel.login(username, password);
	}
	
}
