package com.hyxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("userController")
public class UserController {
	@RequestMapping("select")
	public String name() {
		System.out.println("111");
		return null;
		
	}
  
}
