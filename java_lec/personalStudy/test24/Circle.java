package test24;
/*
(2)클래스명 : Circle
-r:int
+Circle()
+Circle(r:int)
+setter & getter
+getCalc():double 
+toString():String    ==>  반지름 : 10  /   반지름 : 5 출력

 */
public class Circle {
	//field(variable) 선언
	private int r;
	
	//default constructor 생성자
	public Circle() {
		super();
	}
	//parameter constructor 매개변수 생성자
	public Circle(int r) {
//		super();
		this.r=r;
	}
	//getter출력, setter 입력..?
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	//override한 것
	public double getCalc() {
		return 0.0;
	}
	//toString
	public String toString() {
		return "반지름 : "+r;
	}
	
}
