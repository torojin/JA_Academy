package com.ja.reference.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test/*")
public class Test {
	//@RequestMapping("/test1")
	//무조건 post 방식으로 받고 싶을때
	//@PostMapping("/test1")
	//무조건 get 방식으로 받고 싶을 때
	@GetMapping("/test1")
	public String test1() {
		System.out.println("안녕하세요1");
		return "test1";
	}
	@RequestMapping("/test2")
	public String test2(HttpSession session) {
		//session이 필요한 경우 이렇게 사용하면 된다
		//Spring에서는 보통 requset보다 session으로 많이 처리 한다
		session.invalidate();
		session.setAttribute("xxx", 1111);
		session.getAttribute("xxx");
		//request 객체는 
		return "test1";
		
	}
	@RequestMapping("/test3")
	public String test3(Model model) {
		//JSP에서 request.setAttribute로 처리하던걸
		//Spring에선 Model이라는 인터페이스를 사용
		String title = "제목입니다.";
		
		model.addAttribute("title",title);//request.setAttribute하는 것
		
		return "test1";
	}
		
	
}
