package com.jut.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jut.dao.LoginDao;

@Controller
public class LoginController {
	@Autowired
	private LoginDao loginDao;

	/*@RequestMapping("index")
	public String index() {
		return "index";

	}
*/
	@RequestMapping("/")
	private String loginPage() {
		return "login";

	}

	@RequestMapping( "/login")
	private String login( @RequestParam("username") String username, @RequestParam ("password")String password) {
		boolean isValid = loginDao.login(username, password);
		if (isValid==true) {
	
			return "index";
		}else
		return "login";
	}
}