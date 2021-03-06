package com.ja.reference.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ja.reference.mapper.BoardSQLMapper;
import com.ja.reference.vo.BoardVo;

@Service
public class BoardService {
	//service는 추상적인 개념이 들어가야한다 (select와 같은 명칭을 사용하면 안됨)
	//DAO에서는 아이디 패스워드같은 정보를 뽑아내는 것 / 정확한 개념의 명칭을 사용해야한다(select 같은 개념)
	
	//interface 주입시켜줌
	@Autowired
	private BoardSQLMapper boardSQLMapper;
	
	//boardVo를 만들었다는 가정하에
	//문제가 되는것은 service는 기능과 관련된 것 
	//컨트롤러에 등록하기 위해 controller에 주입을 시켜줘야 한다.
	public BoardVo getContent(int b_no) {
		
		//DB연동(MyBatis)
		return boardSQLMapper.selectByNo(b_no);
		
		//데이터가 생성됐다는 가정하에 
		//return new BoardVo(1,2,"제목","내용",null);
	}
	
	public ArrayList<BoardVo> getContentAll() {
		return boardSQLMapper.selectAll();
	}
}
