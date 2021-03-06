package com.ja.aoptest;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Annotation 방식
@Controller
public class BoardController {
	//주입해서 사용할 때
	//컨테이너 내부에서 자동 주입을 시켜서 사용
	//
	@Autowired
	private BoardServiceImpl boardService;
	
	@RequestMapping("/main_page.do")
	public String mainPage(HttpServletRequest request) {
		//BoardServiceImpl s = new BoardServiceImpl();
		//ArrayList<String> list = s.getBoardList();
		
		//주입해서 사용할 때
		ArrayList<String> list = boardService.getBoardList();
		
		request.setAttribute("sss", list);
		
		return "main_page"; //forwarding 시킴
	}
	@RequestMapping("read_content_page.do")
	public String readContentPage() {
		return "read_content_page";
	}
	
	@RequestMapping("/test1")
	public String test1() {
		boardService.adminFunction();
		boardService.getContent();
		return "aaa";
	}
	
	
}
