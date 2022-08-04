package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	@RequestMapping(value = "/member/joinMember", method = RequestMethod.GET)
	public void member() {		
	}
	
	@RequestMapping(value="/member/joinMember", method = RequestMethod.POST)
	public String join() {
		return "/main";
	}
}
