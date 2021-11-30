package com.example.codingtest.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	List<UserDAO> users=new ArrayList<UserDAO>();
	{
		users.add(new UserDAO("Leanne Graham","Bret","12345678","Sincere@april.biz"));
	}
	@RequestMapping(value="/getUsers")
	public List<UserDAO> getUsers(){
		return users;
	}
	
	
	
	

}
