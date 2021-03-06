package abstractex;


//-------------------------------------------------------------3
//추상(미완성)클래스
//부모클래스
abstract class AA{
	//abstract 메소드가 없어도
	//구조상 완성은 되어 있지만 2%부족해도 abstract 선언은 가능하다
	public void view1() {}; //선언의 형태 / 명확히 선언한 상태가 아니다
	public void view2() {System.out.println("view2 method");}
}
//자식 클래스(상속)
class BB extends AA{
	//오버라이드
	@Override
	public void view1() {System.out.println("view11 method");}
	//AA클래스의 view 재정의 - 강제성이 없음
	//abstract가 없으면 강제성이 없어진다??
}

public class AbstractEx1 {

	public static void main(String[] args) {
//		AA ob=new AA(); //객체 생성 불가능 abstract 클래스이기 때문
		//아래 코드가 의미 없어짐
//		ob.view1(); //view1 method 나옴
//		ob.view2();	//view2 method 나옴
		
		//부모클래스의 참조 객체 생성
		AA ob2=new BB(); //ob2로 참조변수를 만들어 후손객체 생성
		ob2.view1();	//view11 출력
		ob2.view2();	//view2 출력
	}

}




//abstract class(추상클래스?) : 미완성 상태의 클래스이기 때문에 객체를 생성할 수 없음
//상속을 받아서 오버라이드에서 완성을 시켜주는 거라고 알면 될듯
//????


//-------------------------------------------------------------2
/*
//추상(미완성)클래스
//부모클래스
abstract class AA{
	abstract public void view1(); //선언의 형태 / 명확히 선언한 상태가 아니다
	public void view2() {System.out.println("view2 method");}
}
//자식 클래스(상속)
class BB extends AA{
	//오버라이드
	@Override
	public void view1() {System.out.println("view11 method");}
	//AA클래스의 view 재정의 - 강제성이 있음
}

public class AbstractEx1 {

	public static void main(String[] args) {
//		AA ob=new AA(); //객체 생성 불가능 abstract 클래스이기 때문
		//아래 코드가 의미 없어짐
//		ob.view1(); //view1 method 나옴
//		ob.view2();	//view2 method 나옴
		
		//부모클래스의 참조 객체 생성
		AA ob2=new BB(); //ob2로 참조변수를 만들어 후손객체 생성
		ob2.view1();	//view11 출력
		ob2.view2();	//view2 출력
	}

}
*/

//-------------------------------------------------------------1
/*
//일반클래스
//부모클래스
class AA{
	public void view1() {System.out.println("view1 method");}
	public void view2() {System.out.println("view2 method");}
}
//자식 클래스(상속)
class BB extends AA{
	//오버라이드
	@Override
	public void view1() {System.out.println("view11 method");}
	//AA클래스의 view 재정의 - 강제성이 없음
}

public class AbstractEx1 {

	public static void main(String[] args) {
		AA ob=new AA(); //객체 생성 가능
		ob.view1(); //view1 method 나옴
		ob.view2();	//view2 method 나옴
		
		//부모클래스의 참조 객체 생성
		AA ob2=new BB(); //ob2로 참조변수를 만들어 후손객체 생성
		ob2.view1();	//view11 출력
		ob2.view2();	//view2 출력
	}

}
*/