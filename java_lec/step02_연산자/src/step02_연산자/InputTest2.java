package step02_������;
/*
 * A���� �Է��ϼ��� : 15
 * B���� �Է��ϼ��� : 10
 * 
 * 15+10 = 25
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		int a,b;
		
		System.out.print("A���� �Է��ϼ��� : ");
		a=Integer.parseInt(br.readLine());
		
		System.out.print("B���� �Է��ϼ��� : ");
		b=Integer.parseInt(br.readLine());
		
		System.out.println(a+"+"+b+"="+(a+b));
		
	}

}
