package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제9] for문을 이용하여 제곱값을 구하시오

x의 값을 입력하시오 : 3
y의 값을 입력하시오 : 3
3의 3승은 27
 */
public class Exercise09 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x,y;
		
		System.out.print("x의 값을 입력하세요 : ");
		x=Integer.parseInt(br.readLine());
		
		System.out.print("y의 값을 입력하세요 : ");
		y=Integer.parseInt(br.readLine());
		int z=x;
		for(int i=1; i<y; i++) {
			x*=z; //x=x*z
		}
		System.out.println(z+"의 "+y+"승은 "+x);
	}

}
