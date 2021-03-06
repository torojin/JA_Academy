package com.ja.reference.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ja.reference.service.BoardService;
import com.ja.reference.vo.BoardVo;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	//Service를 주입시켜줌
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/read_content_page.do")
	public String mainPage(int b_no, Model model) {
		
		//파라미터가 넘어옴
		BoardVo boardVo = boardService.getContent(b_no);
		
		model.addAttribute("boardVo", boardVo);
		
		return "read_content_page";
	}
	
	@RequestMapping("/read_page.do")
	public String selectAll(Model model) {
		
		System.out.println("sadfasd");
		ArrayList<BoardVo> boardVoAll = boardService.getContentAll();
		System.out.println(boardVoAll.size());
		model.addAttribute("boardVoAll", boardVoAll);
		
		return "read_page";
	}
	
	
	
	@RequestMapping("/read_page2.do")
	public String selectAll2(Model model) {
		
		System.out.println("sadfasd");
		ArrayList<BoardVo> boardVoAll = boardService.getContentAll();
		System.out.println(boardVoAll.size());
		model.addAttribute("boardVoAll", boardVoAll);
		
		return "read_page1111";
	}
}
