package test17;
/*
[문제17]다음 프로그램을 만드시오
(1)package명은 test17으로 하고 Student.java,  StudentEx.java파일을 만드시오
(2)클래스명 : Student
-name:String
-kor:int
-eng:int
-mat:int
+setStudent(name:String, kor:int, eng:int, mat:int):void
+getTotal():int        ==> 총점구하기
+getAvg():double    ==> 평균구하기
+getGrade():char     ==> 학점구하기 (switch이용)
+getResult():String   ==> 결과 구하기 (if이용)
+getView():String    ==> 출력문 만들기

(3)클래스명 : StudentEx
Student ob=new Student();
ob.setStudent("이순신",75,80,90);
System.out.println(ob.getView());

(4)출력화면
나의 이름은 이순신이고 총점은 245점이고 
평균은 81.666666이고 학점은 B학점이며 
결과는 합격입니다
 */
public class StudentEx {

	public static void main(String[] args) {
		//객체 생성
		Student ob=new Student();
		ob.setStudent("이순신",75,80,90);
		System.out.println(ob.getView());
	}

}
