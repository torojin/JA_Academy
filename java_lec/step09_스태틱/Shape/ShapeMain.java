package Shape;
//정적 바인딩을 동적 바인딩으로 바꿔보자
public class ShapeMain {

	public static void main(String[] args) {
		//정적 바인딩
		Rectangle ob1=new Rectangle(4,5);
		System.out.println("사각형의 넓이  : "+ob1.getSize());//20
		
		Triangle ob2=new Triangle(3,7);
		System.out.println("삼각형의 넓이  : "+ob2.getSize());//10.5
		
		
		//바인딩 : 관계없는 것 끼리 연결시켜주는 것
		
		//동적 바인딩
		//부모 클래스의 참조변수로 자식 객체 생성
		//강사님 코드
		//null로 선언하는 이유
		//sh의 값이 변화가 일어난다고 가정해보자 
		//리턴 해야하는 경우에는 자꾸 객체를 만들어서 사용해야해서...
		//조건검사를 처리할 때 값이  null값으로 넘어오면 문제가 있는 것이라고 인지하고..
		
		Shape sh=null;//조건 검사 할 때 실무에 필요
		
		sh=new Rectangle(4,5);
		System.out.println("사각형의 넓이  : "+sh.getSize());
		sh=new Triangle(3,7);
		System.out.println("삼각형의 넓이  : "+sh.getSize());
		
		/*
		//내 코드
		//객체 매개변수 전달
		Shape sh1=new Rectangle(4,5);
		System.out.println("사각형의 넓이  : "+sh1.getSize());//20 	//Shape method 호출
		
		Shape sh2=new Triangle(3,7);
		System.out.println("삼각형의 넓이  : "+sh2.getSize());//10.5 //Shape method 호출
		*/
		
	}
	

}
