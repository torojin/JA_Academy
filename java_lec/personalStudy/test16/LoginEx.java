package test16;
/*
[문제16]다음 프로그램을 만드시오
(1)package명은 test16으로 하고 LoginEx.java파일을 하나 만들어서 
클래스를 2개 추가하시오

(2)클래스명 : Login
-id:String
-pw:String
+setLogin(id:String, pw:String):void
+viewLogin():void

(3) 클래스명 : LoginEx
Login ob=new Login();
ob.setLogin("pororo","1234");
ob.viewLogin();

(3)출력화면
아이디는 pororo이고 비밀번호는 1234입니다
 */
class Login{
	//filed 생성
	private String id;
	private String pw;
	
	//setter
	public void setLogin(String id, String pw) {
		this.id=id;
		this.pw=pw;
	}
	//출력
	public void viewLogin() {
		System.out.println("아이디는 " +id+"이고 비밀번호는 "+pw+"입니다");
	}
	
}

public class LoginEx {

	public static void main(String[] args) {
		Login ob=new Login();
		ob.setLogin("pororo","1234");
		ob.viewLogin();
		
	}

}
