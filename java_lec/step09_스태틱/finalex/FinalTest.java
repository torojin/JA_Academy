package finalex;

//클래스 생성
//부모 클래스
class A{
	final int n=100; //final / 스택 영역에 ??
	final public void view() {
//		n=200; --final 변수는 값을 변경할 수 없다. /final은 상수화 시킨다?
		System.out.println("A class");		
	}
}
/*
//abstract은 final를 사용 불가능하다.
//final를 사용하고 싶으면 abstract를 지우고 사용해야한다.
abstract class A{
	final int n=100; //final / 스택 영역에 ??
	abstract final public void view() {
//		n=200; --final 변수는 값을 변경할 수 없다.
		System.out.println("A class");		
	}
}*/

//자식클래스 / A상속
class B extends A{
/*
	@Override
	public void view() {// final 메서드는 override 불가능
		
	}
*/
}

public class FinalTest {

	public static void main(String[] args) {

	}

}
