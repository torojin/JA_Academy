package test22;
/*
(3) 파일명 : SalarySub   ==> Salary상속
-dept:String
+SalarySub()
+SalarySub(dept:String)
+SalarySub(name:String, salary:int, dept:String)   ==> name, salary는 부모생성자로 넘김
+toString():String         ==>  부서출력

(5) 출력화면
이름 : 야철대장
연봉 : 85000000
부서 : 철기방
 */

//자식클래스 / 부모클래스 Salary 상속
public class SalarySub extends Salary{
	//filed
	private String dept;
	
	//default constructor
	public SalarySub() {
		super();
	}
	public SalarySub(String dept) {
		super();
	}
	public SalarySub(String name, int salary, String dept) {
		super(name, salary);
		this.dept=dept;
	}
	//toString
	@Override
	public String toString() {
		return super.toString()+"\n부서 : "+dept;
	}
}
