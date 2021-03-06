package test24;
/*
 (3)클래스명 : CircleRound
+CircleRound()
+CircleRound(r:int)
+getCalc():double   ==> 원의 둘레를 구한다(반지름*2*3.14)
+toString():String    ==> 원의 둘레는 62.8입니다   출력
 */
public class CircleRound extends Circle{
	//default constructor
	public CircleRound() {
		super();
	}
	//parameter constructor
	public CircleRound(int r) {
		super(r);
	}
	@Override
	public double getCalc() {
		return super.getR()*2*3.14;
	}
	@Override
	public String toString() {
		return super.toString()+"\n원의 둘레는 "+String.format("%.1f", getCalc())+"입니다\n";
	}
}
