package com.ja.reference.vo;

import java.util.Date;

public class BoardVo {
	//filed 생성
	private int board_no;
	private int member_no;
	private String board_title;
	private String board_content;
	private Date board_writedate;
	
	//default Constructor 생성
	public BoardVo() {
		super();
	}

	public BoardVo(int board_no, int member_no, String board_title, String board_content, Date board_writedate) {
		super();
		this.board_no = board_no;
		this.member_no = member_no;
		this.board_title = board_title;
		this.board_content = board_content;
		this.board_writedate = board_writedate;
	}

	public int getBoard_no() {
		return board_no;
	}

	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}

	public int getMember_no() {
		return member_no;
	}

	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}

	public String getBoard_title() {
		return board_title;
	}

	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}

	public String getBoard_content() {
		return board_content;
	}

	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}

	public Date getBoard_writedate() {
		return board_writedate;
	}

	public void setBoard_writedate(Date board_writedate) {
		this.board_writedate = board_writedate;
	}
	
	
	
	

}
