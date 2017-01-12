package com.packt.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.packt.webstore.domain.repository.ProductRepository;

@Controller
public class HomeController 
{
	@Autowired
	ProductRepository productRepository;
	
	@RequestMapping("/")
	public String welcome(Model model) 
	{
		model.addAttribute("greeting", "Welcome to Web Store!");

		model.addAttribute("tagline", "The one and only amazing webstore");
		return "welcome";
	}
	
}