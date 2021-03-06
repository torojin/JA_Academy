package test24;
/*
(4)클래스명 : CircleSize
+CircleSize()
+CircleSize(r:int)
+getCalc():double   ==> 원의 넓이를 구한다(반지름*반지름*3.14)
+toString():String    ==> 원의 넓이는 78.5입니다 출력
 */
public class CircleSize extends Circle{
	
	//default constructor 생성자
	public CircleSize() {
		super();
	}
	public CircleSize(int r) {
		super(r);
	}
	@Override
	public double getCalc() {
		return super.getR()*super.getR()*3.14;
	}
	//toString
	@Override
	public String toString() {
		return super.toString()+"\n원의 넓이는 "+getCalc()+"입니다";
	}
	
	

}
