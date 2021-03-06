package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 [문제7]2개의 숫자와 연산자를 입력하여 계산하시오
        조건1) 실수인경우는 소수이하 2째자리까지 출력하시오
        조건2) 연산자가 +,-,*,/ 이외의 문자가 들어오면 
                 "연산자error"출력하시오

[실행결과]
x값을 입력하시오 : 25  
y값을 입력하시오 : 36
연산자를 입력(+,-,*,/) : +
25 + 36 = 61

x값을 입력하시오 : 25  
y값을 입력하시오 : 36
연산자를 입력(+,-,*,/) : /
25 / 36 = 0.69      

x값을 입력하시오 : 25  
y값을 입력하시오 : 36
연산자를 입력(+,-,*,/) : #
연산자 error
 */
public class Exercise07 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x;
		int y;
		char c;
		System.out.print("x값을 입력하시오 : ");
		x=Integer.parseInt(br.readLine());
		System.out.print("y값을 입력하시오 : ");
		y=Integer.parseInt(br.readLine());
		System.out.print("연산자를 입력(+,-,*,/) : ");
		c=br.readLine().charAt(0);
		
		switch(c) {
		case '+' : System.out.println(x+" + "+y+" = "+(x+y)); break;
		case '-' : System.out.println(x+" - "+y+" = "+(x-y)); break;
		case '*' : System.out.println(x+" * "+y+" = "+(x*y)); break;
		case '/' : System.out.println(x+" / "+y+" = "+String.format("%.2f",((double)x/(double)y))); break;
		default : System.out.println("연산자 error"); break;
		}
		
	}

}
