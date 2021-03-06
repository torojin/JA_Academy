package com.ja.freeboard.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.ja.freeboard.vo.MemberVo;

//DAO 
//사실상 안쓰는 방법
//급하게 한시간내에 테스트 코드 만들때 사용
//앞으로는 xml로 만들어서 사용
public interface MemberSQLMapper {
	//key를 먼저 구하는 방식
	@Select("select fb_member_seq.nextval from dual")
	public int createKey();
	
	@Insert("INSERT INTO FB_Member VALUES(#{member_no}, #{member_id}, #{member_pw},#{member_nick},#{member_sex},SYSDATE)")
	public void insert(MemberVo vo);//getter를 받아와서 세팅
	
	//동일한 ID,PW가 있으면 ArrayList로 처리하고
	//무조건 한 개여야만 하는 경우엔 리턴타입은 MemberVo만 사용
 	@Select("SELECT * FROM FB_Member WHERE member_id = #{member_id} AND member_pw = #{member_pw}")
	public MemberVo selectByIdAndPw(MemberVo memberVo);
	
	@Select("SELECT * FROM FB_Member WHERE member_no = #{no}")
	public MemberVo selectByNo(int no);
	
	
}
