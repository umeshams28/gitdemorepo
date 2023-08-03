package com.example.gittest.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControler {

	@GetMapping("/get")
	public String getMesg() {
		return "hi";
	}
	
	@GetMapping("/getname")
	public String getname() {
		return "hi wellcome";
	}
	
	@GetMapping("/newmethod")
	public String getExtra() {
		return "this is new method";
	}
}
