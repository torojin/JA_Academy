package test22;
/*
[문제22] 다음 프로그램을 완성하시오
(1) package명은 test22로 하고 Salary.java, SalarySub.java, MainEx.java파일을 만드시오
(2) 파일명 : Salary      
-name:String
-salary:int
+Salary()
+Salary(name:String, salary:int)
+toString():String         ==>  이름, 연봉출력
    
(3) 파일명 : SalarySub   ==> Salary상속
-dept:String
+SalarySub()
+SalarySub(dept:String)
+SalarySub(name:String, salary:int, dept:String)   ==> name, salary는 부모생성자로 넘김
+toString():String         ==>  부서출력

(4) 파일명 : MainEx  --main()포함 O
SalarySub ob = new SalarySub("야철대장",85000000,"철기방");
System.out.println(ob.toString());

(5) 출력화면
이름 : 야철대장
연봉 : 85000000
부서 : 철기방
 */
public class MainEx {

	public static void main(String[] args) {
		SalarySub ob = new SalarySub("야철대장",85000000,"철기방");
		System.out.println(ob.toString());
	}

}
