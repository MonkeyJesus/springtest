package org.andy.maventest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {
	@RequestMapping("/login")
	public String login(HttpServletRequest request,HttpServletResponse response){
		System.out.println("======================");
		System.out.println(request.getParameter("id"));
		return "success";
	}
}
