package finalex;
/*
 * 자바에서 생략 가능한 것을 보자
 */
//import java.lang.Object; 생략가능?
//import java.lang.String; /기본적으로 사용하고 있어서 생략가능
//import java.lang.System;
class Test{
	String name="강호동";
	public Test() {
		super(); //생략가능
	}
	public void view() {
		System.out.println("이름 : "+name);
//				System.out.println("이름 : "+this.name.toString());이 생략 되어 있다.
	}
	public String toString() {
		return name;
	}
}
public class Object {

	public static void main(String[] args) {
		new Test().view();
		
		Test ob=new Test();
		ob.view(); 
//		new Test().view(); / 위에랑 똑같음.
		//치환정도의 개념으로 생각하면 될 듯
	}

}
