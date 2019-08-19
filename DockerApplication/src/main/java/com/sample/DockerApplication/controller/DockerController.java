package com.sample.DockerApplication.controller;

import javax.servlet.http.HttpServlet;
import javax.xml.ws.Response;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	

	
	@GetMapping("/welcome")
	public String getMyName() {
		return "||Welcome To Aanad Rathi Pvt. LTD||";
		
		
	}

	
}
