package com.ja.aoptest;

import java.util.*;

import org.springframework.stereotype.Repository;

//Annotation 방식 사용
//DAO에는 Repository를 사용
//어떤 형태(?)를 사용하는지 표기하는 것으로 생각해도 될듯..?
@Repository
public class BoardDao {
	public ArrayList<String> selectAll() {
		//DB연동
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("안녕하세요1");
		list.add("안녕하세요2");
		list.add("안녕하세요3");
		
		return list;
	}
}
