package ifEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * �������� �Է��ϼ��� : 5
 * 314/
 * ���� ���� :78.5(��*��*3.14)
 * ���� �ѷ�: 31.4(2*3.14*��)
 */
public class InputTest4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr=new InputStreamReader(System.in); 
		BufferedReader br=new BufferedReader(isr);
		int a;
		double size, rnd;
		
		System.out.print("�������� �Է��ϼ��� : ");
		a=Integer.parseInt(br.readLine());
		//System.out.println("���� ���� : "+(a*a*3.14));
		size=3.14*a*a;
		rnd=2*3.14*a;
		System.out.println("���� ���� : "+size);
		System.out.println("���� �ѷ� : "+String.format("%.1f", rnd));
		
		System.out.printf("���� ���� : %.1f\n", (size));
		System.out.printf("���� �ѷ� : %.1f\n", (rnd));
			
	}

}
