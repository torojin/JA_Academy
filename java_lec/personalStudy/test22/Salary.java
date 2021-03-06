package test22;
/*
(2) 파일명 : Salary      
-name:String
-salary:int
+Salary()
+Salary(name:String, salary:int)
+toString():String         ==>  이름, 연봉출력
 
(5) 출력화면
이름 : 야철대장
연봉 : 85000000
부서 : 철기방
 */
public class Salary {
	//filed(변수)
	private String name;
	private int salary;
	
	//default 생성자
	public Salary(){
		super();
	}

	public Salary(String name, int salary) {
		super();
		this.name=name;
		this.salary=salary;
	}
	//toString
	@Override
	public String toString() {
		return "이름 : "+name+"\n연봉 : "+salary;
	}

}
