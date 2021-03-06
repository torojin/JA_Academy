package override;


//클래스 2개 생성
//부모클래스
class Test1{
	//메서드 생성
	public void view1() {System.out.println("view1 method");}//2
	public void view3() {System.out.println("view3 method");}//5
}
//자식 클래스
class Test2 extends Test1{
	@Override	//어노테이션
	public void view1() {//3
		super.view1();//4
		System.out.println("view11 method");//5
		}
	public void view2() {System.out.println("view22 method");}
}

public class OverrideEx {

	public static void main(String[] args) {
		//동적 바인딩의 형태
		Test1 ob=new Test2();// 부모클래스의 참조변수로 자식 객체 생성 
		// Test1에 먼저 접근 후 Test1 view1메소드에 접근
		//참조 변수 ob를 통해서 Test1에 정의되어 있는 메소드만 호출 가능하도록
		//new Test2() / Test2()객체를 생성해라!
		//객체 생성시 생성된 객체는 메모리에 저장되고, 저장된 메모리의 주소 값이 반환되어 참조변수에 저장
		//ob 참조 변수
		//Test1 자료형 변수 
		ob.view1();//1
//		ob.view2();//view2는 보이지 않기 때문에 사용할 수 없다.
	ob.view3();
	
	
	//일반적인 객체 생성
//		Test2 ob=new Test2();
//		ob.view1();
//		ob.view2();
//		ob.view3();
	}

}