package com.ja.aoptest;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Annotation 방식 사용

@Service
public class BoardServiceImpl {
	
	
	//private LogAdvice logAdvice = new LogAdvice();
	
	//주입해서 쓰는 방식
	@Autowired
	private BoardDao boardDao;
	
	//Annotation을 사용하면 setter를 생성안해도 된다
	//setter는 자동으로 생성해줌
	/*
	public void setBoardDao(BoardDao boardDao){
	 
		this.boardDao = boardDao;
	}
	*/
	
	//controller에서는 이걸 호출한다
	public ArrayList<String> getBoardList(){
		//logAdvice.printLog();
		//ArrayList<String> list = new BoardDao().selectAll();
		//주입해서 쓰는 방식
		ArrayList<String> list = boardDao.selectAll();
		
		return list;
		
	}
	
	//중요한 로직들은 service에 있는게 맞다
	//그렇기때문에 service가 중요
	//이런 순수한 코드들을 비즈니스 로직(필수 로직)이라고 한다	//필수 로직, 코어가 되는 코드들
	
	//API를 만들어보자
	public void login() {
		//logAdvice.printLog();
		
		System.out.println("로그인 시작"); //이건 비즈니스 로직이 아니다. / 있어도 그만 없어도 그만인 코드 / 코드가 동작하는데 필수가 아닌 코드
		
		//로그인과 관련된 매우 중요한 기능들.. 수행
		System.out.println("로그인 기능 수행...");
		
		System.out.println("로그인 끝");
	}
	
	public void getContent() {

		//logAdvice.printLog();
		System.out.println("getContent 시작");
		
		//읽기와 관련된 중요한 로직..
		System.out.println("컨텐트 가져오기 기능 수행");
		
		System.out.println("getContent 끝");
	}
	
	public void adminFunction() {
		//logAdvice.printLog();
		//관리자와 관련된 중요한 로직..
		System.out.println("관리자 기능 수행");
	}
	
	
	
}
