package com.example.demo.controller;
import com.example.demo.entity.*;

import org.hibernate.metamodel.model.domain.internal.AbstractAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class indexcontroller {
	@GetMapping("/reg")
String index11() {
		return"registration";
		
	}
	@GetMapping("/if")
	String fox22() {
		return "login";
}
	@PostMapping("/make")
	public String userconfig(@ModelAttribute user useri,Model modeli) {
		
modeli.addAttribute("firstname", useri.getUname());
return "final";
	}
	
}
