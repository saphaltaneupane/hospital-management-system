package com.bway.springproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.springproject.model.User;

@Controller
public class LoginController {
	@GetMapping("/login")
  public String getLogin() {
	  return "LoginForm";
  }
	@PostMapping("/login")
	public String postLogin(@ModelAttribute User u, Model model ) {
		if(u.getUsername().equals("saphalta") && u.getPassword().equals("123") ) {
			model.addAttribute("uname",u.getUsername());
			
			return "Home"; 
		}
		model.addAttribute("message","user not found!!");
		return "LoginForm";
	}
}
