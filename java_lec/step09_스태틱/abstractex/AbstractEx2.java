package abstractex;
//추상클래스
//자식 클래스만 객체를 만들 수 있다.
abstract class Shape{
	//자식 클래스에서 공통으로 메서드의 이름을 사용하게끔 정의해주는것?? 
	//추상 클래스 매서드 선언 할 떄 중괄호 빼고
	abstract public void onDraw();
	abstract public void onDelete();
}
//------------------------------------------------
//자식 클래스 생성
class Rectangle extends Shape{

	@Override //부모클래스에서 쓰는 동작 기능의 다형성을 추구하기 위해서 사용
	public void onDraw() {
		System.out.println("사각형을 그린다");
	}

	@Override
	public void onDelete() {
		System.out.println("사각형을 지운다");
	}
	
}
//------------------------------------------------
//자식 클래스 생성
//강제적
class Circle extends Shape{

	@Override
	public void onDraw() {
		System.out.println("원을 그린다");
	}

	@Override
	public void onDelete() {
		System.out.println("원을 지운다");
	}
	
}

public class AbstractEx2 {

	public static void main(String[] args) {
		//자식 클래스만 객체를 만들 수 있다.
		//정적 바인딩
		Rectangle ob1=new Rectangle();
		ob1.onDraw();
		ob1.onDelete();
		
		Circle ob2=new Circle();
		ob2.onDraw();
		ob2.onDelete();
	
		System.out.println();
		//동적 바인딩
		Shape sh=null;
		sh=new Rectangle();
		sh.onDraw();
		sh.onDelete();
		
		sh=new Circle();
		sh.onDraw();
		sh.onDelete();
		

	}

}
