package test17;
/*
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
 */
public class Student {
	//filed 생성
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	public void setStudent(String name, int kor, int eng, int mat) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}
	public int getTotal() {
		return kor+eng+mat;
	}
	public double getAve() {
		return getTotal()/3.0;
	}
	public char getGrade() {
		switch((int)getAve()/10) {
		case 10:
		case 9: return 'A';
		case 8: return 'B';
		case 7: return 'C';
		case 6: return 'D';
		default: return 'F';
		}
		
	}
	public String getResult() {
		
		if(getGrade()=='F') return"불합격";
		else return "합격";
		
	}
	public String getView() {
		return "나의 이름은 "+name+"이고 총점은 "+getTotal()+"점이고 평균은 "+getAve()+"이고 학점은 "+getGrade()+"학점이며 결과는 "+getResult()+"입니다";
		
	}
}