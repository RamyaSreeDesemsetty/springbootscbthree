package com.mycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyFirstNewController {
	@RequestMapping("/home")
	public String view() {
		return "home";
	}
}
