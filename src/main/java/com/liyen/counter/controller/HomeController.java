package com.liyen.counter.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(HttpSession session) {
//		String count = (String)session.getAttribute("count");
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 1);
		}
		else {
			Integer currentCount = (Integer) session.getAttribute("count") + 1;
			session.setAttribute("count", currentCount);
		}
		return "index.jsp";
	}
	
	@RequestMapping("/2")
	public String index2(HttpSession session) {
//		String count = (String)session.getAttribute("count");
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 2);
		}
		else {
			Integer currentCount = (Integer) session.getAttribute("count") + 2;
			session.setAttribute("count", currentCount);
		}
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(Model model, HttpSession session) {
		if (session.getAttribute("count") == null) {
			model.addAttribute("count", 0);
		}
		else {
			Integer currentCount = (Integer) session.getAttribute("count");
			model.addAttribute("count", currentCount);			
		}
		return "counter.jsp";

	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.setAttribute("count", 0);
		return "redirect:/counter";			
	}
}
