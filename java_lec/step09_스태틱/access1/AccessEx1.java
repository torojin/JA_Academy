package access1;

import access2.AccessEx3;
import access2.AccessEx4;

/*
 * 접근할 때 변수로 접근하는 것보다 함수(메서드)로 접근할것
 * 외부에서 접근할 수 있게 하려면 public
 * 내부에서만 접근할 수 있게 하려면..private?
 */
public class AccessEx1 {
	//field(variable) 선언
	private int x=10;
	private int y=20;
	
	public static void main(String[] args) {
		//object or Instance생성
		AccessEx1 a1=new AccessEx1();
		System.out.println(a1.x+"\t"+a1.y); //자기 클래스 안에서 실행되는 건 문제 없다.
//		System.out.println(a1.a+"\t"+a1.b); //????
		
		AccessEx2 a2=new AccessEx2();
		System.out.println(a2.x+"\t"+a2.y+a2.a); //default 접근 지정자 로 선언한 것
		
		//패키지를 벗어나서 변수 선언하려면 public or protected를 사용해서 선언
		//import 해야 접근 가능
		AccessEx3 a3=new AccessEx3(); 
		System.out.println(a3.x+"\t"+a3.y);
//		System.out.println(a3.x+"\t"+a3.y+a3.x1);// x1은 default로 되어있어 패키지가 벗어나면 접근 불가능
		
		AccessEx4 a4=new AccessEx4();
//		System.out.println(a4.a); //protected 로 선언하면 같은 패키지 안에서 사용 가능 / 벗어나면 불가능?
		
		
		
		
		
	}

}
