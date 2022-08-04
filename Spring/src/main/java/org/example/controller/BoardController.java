package org.example.controller;

import org.ksm.model.BoardVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {
	@RequestMapping(value = "/board/list", method = RequestMethod.GET)
	public String list() {
		return "board/list";
	}
	@RequestMapping(value = "/board/write", method = RequestMethod.GET)
	public String write() {
		return "board/write";
	}
	@RequestMapping(value = "/board/write", method = RequestMethod.POST)
	public void writePost(BoardVo bvo) {
		System.out.println(bvo);
	}
}