package constructor;
//생성자 : 클래스의 이름과 동일한 매서드의 형태, 리턴 자료형이 없음
//		 객체 생성 담당, 생성자를 만들지 않을 경우는 디폴트 생성자가 자동 생성
//함수의 한 종류 그래서 overload가 가능하다
// overload method(중복함수) : 같은 이름의 함수를 여러번 구현
// 1. 반드시 함수 이름이 동일
// 2. 매개변수의 타입이 다르거나 개수가 달라야 함
public class ConstructorEx1 {
	//생성자
	//제어는 이동해도 리턴값의 자료형을 표시하지 않는다
	//접근지정자 빼고 이름만 쓰는 경우가 있다. 그것도 생성자임
	public ConstructorEx1() {
		System.out.println("default constructor");
	}
	//생성자 한 개의 매개변수를 처리할 수 있게 
	public ConstructorEx1(String str) {
		System.out.println(str+" constructor");
	}
	
	//생성자 여러 개의 매개변수 처리할 수 있게 
	public ConstructorEx1(String str, int n) {
		System.out.println(str+" "+n+" constructor");
	}
	//함수 리턴값의 자료형이 없는것
	//제어만 이동하는 리턴을 사용하는 것
	//void자료형
	public void ConstructorEx11() {
		
	}
		
	public static void main(String[] args) {
		//객체 생성
		//한번만 쓰고 말거면 아래처럼
		new ConstructorEx1();
		//매개변수 하나짜리 / 생성자에 매개변수 전달
		new ConstructorEx1("가나다");
		//매개변수 여러개짜리 / 생성자에 매개변수 전달
		new ConstructorEx1("가나다",10);
	}

}
