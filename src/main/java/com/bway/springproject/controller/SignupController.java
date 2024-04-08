package com.bway.springproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.springproject.model.User;

@Controller
public class SignupController {
	@GetMapping("/signup")
  public String getSignup() {
	  return "SignupForm";
			  
  }
	@PostMapping("/signup")
	public String postSignup(@ModelAttribute User user, Model model) {
		model.addAttribute("user",user);
		return "Profile";
	}
}
