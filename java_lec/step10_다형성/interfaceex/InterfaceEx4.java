package interfaceex;
/*
 * 인터페이스는 선언만 해야한다.
 * 
 * 문제!
 * 
 * class와 interface를 이용해서 성적처리 해보기
 * 
 * / class, interface를 상속받아야 사용가능
 * 클래스 : User
 * -name:String
 * +User()
 * +User(name:String)
 * +toString():String
 * 
 * 인터페이스 Score
 * +sol:int(초기값:20) //배점
 * +getScore():int / 맞은 수 * sol을 리턴
 * 
 * 인터페이스 Print 
 * +toPaint():String
 * 
 * --출력화면
 * 이름 : 홍길동
 * 점수 : 60
 * 
 * 
 */

//부모 클래스 선언
class User{
	//field
	private String name;
	
	//default constructor
	public User() {
		super();
	}
	//Parameter constructor
	public User(String name) {
		super();
		this.name = name;
	}
	//toString
	@Override
	public String toString() {
		return "이름 : "+name;
	}
}

//부모 interface 선언
interface Score{
	public int sol=20;
	public int getScore();
}
interface Print {
	public String toPrint();
}
//상속받은 자식 클래스
public class InterfaceEx4 extends User implements Print,Score {
	int i;
	public InterfaceEx4(String name, int i) {
		super(name);
		this.i=i;
	}
	
	@Override
	public int getScore() {
		return i*sol;
	}
	//변수의 값을 리턴해주는 
	@Override
	public String toPrint() {
		return super.toString()+"\n점수 : "+getScore();
	}
	
	public static void main(String[] args) {
		//메인함수는 건들거 없음
		//객체 생성 후 매개변수 전달
		InterfaceEx4 ob=new InterfaceEx4("홍길동", 3);
		System.out.println(ob.toPrint());
	}



}
