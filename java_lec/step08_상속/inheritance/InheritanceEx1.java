package inheritance;
/*
inheritance(상속)
부모에게 상속 받는거 증여정도로 생각하면 될듯
상속해주는 부모는 써도써도 줄지 않는 마르지 않는 물같은 것
상속을 받으면 부모 클래스에 있는 걸 마음대로 가져다 쓸수 있다.
자식 클래스는 부모 클래스의 모든 자산을 가져다 쓸 수 있다.

부모가 자식껄 사용할 수 없다
 */


//클래스 생성
//부모 클래스
class SuperEx{
	public void show() {
		System.out.println("show1 method");
	}
}
//자식 클래스
//extends SuperEx 부모 상속
class SubEx extends SuperEx{
	//어노테이션??
	@Override//Override 컴파일러가 해석할때 오버라이드라고 표시해주는거?
	public void show() {
		//부모의 것을 보기위해 super를 사용
		//부모클래스의 show메서드 호출
		super.show();
		System.out.println("show2 method");
	}
	
}
public class InheritanceEx1 {

	public static void main(String[] args) {
		//객체 생성
		//상속을 받은 객체를 선언해야 부모 클래스에 접근
		SubEx ob=new SubEx();//자식 객체 
		//클래스 사용
		ob.show();

	}

}


/*
//클래스 생성
//부모 클래스
class SuperEx{
	public void show1() {
		System.out.println("show1 method");
	}
}
//자식 클래스
//extends SuperEx 부모 상속
class SubEx extends SuperEx{
	public void show2() {
		System.out.println("show2 method");
	}
	
}
public class InheritanceEx1 {

	public static void main(String[] args) {
		//객체 생성
		SubEx ob=new SubEx();//자식 객체 
		//클래스 사용
		ob.show1(); //부모클래스 자산 가져다 씀
		ob.show2();
	}

}
*/
