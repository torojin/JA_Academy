package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제8]성적처리프로그램
        중간고사,기말고사,레포트,출석점수를 입력받아서 계산하시오

조건1) (중간+기말)/2      ---> 60%
          과제                   ---> 20%
          출석                   ---> 20%
     
조건2)  90이상 'A'학점     (3)A,B학점  ---->"excellent"
           80이상 'B'학점        C,D학점  ---->"good"
           70이상 'C'학점        F학점    ---->"poor"
           60이상 'D'학점        (switch문이용) 
           나머지 'F'학점
           (if~else if문이용)

[입력화면]
중간고사를 입력하시오 : 90
기말고사를 입력하시오 : 89
과제점수를 입력하시오 : 99
출석점수를 입력하시오: 100

[출력화면]
성적=93.20      <---소수이하 2째자리까지
학점=A              System.out.printf("성적 : %.2f", avg);
평가=excellent
 */
public class Exercise08 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		float mid,fin,rep,att,mfav,repav,attav,total;
		
		System.out.print("중간고사를 입력하세요 : ");
		mid=Integer.parseInt(br.readLine());
		
		System.out.print("기말고사를 입력하세요 : ");
		fin=Integer.parseInt(br.readLine());
		
		System.out.print("과제점수를 입력하세요 : ");
		rep=Integer.parseInt(br.readLine());
		
		System.out.print("출석점수를 입력하세요 : ");
		att=Integer.parseInt(br.readLine());
		
		mfav=((mid+fin)/2)*0.6f;//53.7
		repav=rep*0.2f;//19.8
		attav=att*0.2f;//20
		total=mfav+repav+attav;
		System.out.println(mfav);
		
		char avg;
		if(total>=90) avg='A';
		else if(total>=80) avg='B';
		else if(total>=70) avg='C';
		else if(total>=60) avg='D';
		else avg='F';
		
		String re = "";
		switch(avg) {
		case 'A' :
		case 'B' : re="excellent"; break;
		case 'C' : 
		case 'D' : re="good"; break;
		case 'F' : re="poor"; break;
		}
		System.out.printf("성적= %.2f\n", total);
		System.out.println("학점= "+avg);
		System.out.println("평가="+re);
	}

}
