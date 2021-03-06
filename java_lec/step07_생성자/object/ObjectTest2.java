package object;
//객체 복습
/*
 * 클래스명 : Emp
 * -name : String
 * -dept : String
 * -salary : int
 * 
 * +setEmp(name:String, dept:String, salary:int):void
 * +printEmp():void
 * --홍길동 사원은 개발부에 근무하며 1520000원의 급여를 받아요
 */
class Emp2{
	//filed
	private String name;
	private String dept;
	private int salary;
	
	//setter
	public void setEmp(String name, String dept, int salary) {
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		
	}
	//출력
	public String printEmp() {
		return name+" 사원은 "+dept+"에 근무하며 "+salary+"원의 급여를 받아요";
	}
	
	
}

public class ObjectTest2 {
	
	public static void main(String[] args) {
		//객체생성
		Emp2 ob=new Emp2();
		ob.setEmp("홍길동","개발부",1520000); //값 입력
		ob.printEmp(); //출력
		

	}

}
