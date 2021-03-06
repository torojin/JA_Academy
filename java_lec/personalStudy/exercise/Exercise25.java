package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제25] 추상클래스를 이용하여 다음 프로그램을 완성하시오

(1)추상클래스:  Height 
   필드명 : INCH:double                      ==> final변수, 초기값:2.54 
   메소드 : getInch(double cm):double  ==> 추상메서드
            

(2)처리조건
   Test42클래스에서 Height를 상속받아 getInch()를 재정의 

(3)입.출력
입력(cm) : 5.08
결과 : 2인치
 */

//abstract class
abstract class Height{
	//field
	final public double INCH=2.54;//값이 항상 고정되어 있는거여서 초기화 해줘야함..
	//abstract Method
	abstract public double getInch();
}

class Test42 extends Height{
	@Override
	public double getInch() {
		return INCH;
	}
}
public class Exercise25 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i;
		
		System.out.print("입력(cm) : ");
		i=Integer.parseInt(br.readLine());
		
		//객체 생성
		Height h=new Test42();
		System.out.println(h.getInch());
	}

}
