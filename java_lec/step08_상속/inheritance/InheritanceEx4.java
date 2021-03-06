package inheritance;

//클래스 2개 추가
//부모클래스
class NumberEx1{
	//필드(변수)
	int a,b;
	//생성자
	public NumberEx1(int a, int b) {
		this.a=a;
		this.b=b;
	}
	//메서드
	public void view1() {
		System.out.println(a+" "+b);
	}
}
class NumberEx2 extends NumberEx1{
	//필드
	int c;
	//생성자
	//추가된 필드 int c추가
	public NumberEx2(int a, int b, int c) {
		super(a, b);
		this.c=c;
	}
	//public 메서드 생성
	public void view2() {
		super.view1();//한번에 출력하려고 부모클래스에 접근하기위해 작성
		System.out.println(c);
	}
	
}
public class InheritanceEx4 {

	public static void main(String[] args) {
		//객체 생성
		new NumberEx1(100,200).view1();//부모클래스를 가지고 객체를 만들면 자식 클래스에 있는 객체에 접근을 할 수가 없다.
		
		new NumberEx2(10,20,30).view1();//자식클래스는 부모가 가지고 있는 객체에 접근할 수 있다.
		new NumberEx2(10,20,30).view2();
	}

}
