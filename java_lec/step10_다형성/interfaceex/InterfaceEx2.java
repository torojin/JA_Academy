package interfaceex;
//interface 생성
interface Cryable{
	public void cry();
}
interface Flyable{
	public void fly();
}
//일반클래스에서 abstract를 사용할 때는 다중클래스를 만든다
class Eagle implements Flyable, Cryable{
	//오버라이드 메소드 생성
	@Override
	public void fly() {
		System.out.println("독수리는 날아다녀요~");
		//객체 생성
	}
	//오버라이드 메소드 생성
	@Override
	public void cry() {
		System.out.println("까악~까악~");
	}
		
}
public class InterfaceEx2 {

	public static void main(String[] args) {
		//메서드에 보이는 fly를 호출
		Eagle eg=new Eagle();
		eg.fly();
		eg.cry();
	}

}


/*
//abstract class 생성
//다중상속받는 것을 보여주기 위한 코드
abstract class Cryable{
	abstract public void cry();
}
abstract class Flyable{
	abstract public void fly();
}
//일반클래스에서 abstract를 사용할 때는 다중클래스를 만든다
class Eagle extends Flyable{
	//오버라이드 메소드 생성
	@Override
	public void fly() {
		System.out.println("독수리는 날아다녀요~");//2
		//객체 생성
		new CryableEx().cry();//3
	}
	//클래스 안에 클래스 생성
	//상속
	class CryableEx extends Cryable{
		//오버라이드 메소드 생성
		@Override
		public void cry() {
			System.out.println("까악~까악~");//4
		}
	}
	
}
public class InterfaceEx2 {

	public static void main(String[] args) {
		//메서드에 보이는 fly를 호출
		new Eagle().fly(); //1
	}

}
*/