package object;
/*
 * -base : int
 * -top : int
 * -height : int
 * 
 * +setTrapezoid(base:int, top:int, height:int):void
 * +calc():double <-- 사다리꼴의 넓이를 구해서 리턴(아랫변+윗변)*높이/2.0
 * +toString():String //결과 보고 싶을때 사용
 * 
 */
public class Trapezoid {
	//필드
	private int base;
	private int top;
	private int height;
	
	//setter
	public void setTrapezoid(int base, int top, int height) {
		this.base = base;
		this.top = top;
		this.height = height;
	}
	//calc
	public double calc() {
		return (base+top)*height/2.0;
	}
	//toString
	@Override
	public String toString() {
		return "넓이 : "+calc();
	}

	
}
