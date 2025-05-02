package com.example.SpringBootPostgres.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.SpringBootPostgres.entity.User;
import com.example.SpringBootPostgres.repository.UserRepository;

@Controller
public class UserController {
	
@Autowired
private UserRepository repo;

@GetMapping("/")
public String homepage(Model model) {
	model.addAttribute("user",new User());
	return "home"; // will return a view
}
@ResponseBody
@PostMapping("/save")
public String saveUser(User user) {
	repo.save(user);
	return "user saved"; // this will return data
}
/*@GetMapping("/login")
public String login() {
	return "login";
}*/
}
