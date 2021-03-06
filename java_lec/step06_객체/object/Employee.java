package object;
/*
 * -name:String
 * -dept:String
 * -pay:int
 * -score:double
 * 
 * +setName(name:String):void
 * +setDept(dept:String):void
 * +setPay(pay:ing):void
 * +setScore(score:double):void
 * 
 * +getName():String
 * +getDept():String
 * +getPay():int
 * +getScore():double
 * 
 */
//public class는 한번 만 사용가능
//다른 클래스를 만들어서 사용할 때는 class Name으로 사용해야한다.
public class Employee {
	//field
	private String name;
	private String dept;
	private int pay;
	private double score;
	
	//setter
	public void setName(String name) {
		this.name=name;
	}
	public void setDept(String dept) {
		this.dept=dept;
	}
	public void setPay(int pay) {
		this.pay=pay;
	}
	public void setScore(double score) {
		this.score=score;
	}
	//toString
	//변수의 값을 문자의 열로 만들어서 리턴해주는 것
	@Override
	public String toString() {
		return "이름은 " + name + "이고, "+ dept + "에 근무하며," 
				+"급여는 "+ pay + "원 입사성적은 " + score + "점입니다";
	}
	
	public void setEmployee(String name, String dept, int pay, double score) {
		this.name=name;
		this.dept=dept;
		this.pay=pay;
		this.score=score;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public int getPay() {
		return pay;
	}
	public double getScore() {
		return score;
	}
	
	//메인 메서드
	public static void main(String[] args) {

	}
	


}
