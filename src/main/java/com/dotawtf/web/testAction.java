package com.dotawtf.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testAction {
	
	@RequestMapping(value="/index")
	public String index(){
		return "index";
	}
}
