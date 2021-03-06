package com.ja.reference.vo;

//value object
//필요에 따라서 데이터를 생성을 해야하는 클래스
//계속 유지되어야하는 클래스가 아니다
//그때 그때 생성되는 데이터
public class MemberVo {
	private int m_no;
	private String m_id;
	private String m_pw;
	private String m_nick;
	
	//기본 constructor 생성
	//Spring framework에서는 이것만 사용
	public MemberVo() {
		super();
	}
	//Spring framework에서는 이거 사용 안함
	public MemberVo(int m_no, String m_id, String m_pw, String m_nick) {
		super();
		this.m_no = m_no;
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_nick = m_nick;
	}
	
	public int getM_no() {
		return m_no;
	}
	public void setM_no(int m_no) {
		this.m_no = m_no;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_pw() {
		return m_pw;
	}
	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}
	public String getM_nick() {
		return m_nick;
	}
	public void setM_nick(String m_nick) {
		this.m_nick = m_nick;
	}
	
	
	
	
	
	
}
